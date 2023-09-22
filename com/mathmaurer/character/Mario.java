
package com.mathmaurer.character;

import com.mathmaurer.audio.Audio;
import com.mathmaurer.objects.Object;
import com.mathmaurer.jeu.Main;
import com.mathmaurer.objects.Piece;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Mario extends Person{
    
    
	private ImageIcon icoMario;
	private Image imgMario;
        private boolean jump;
        private int countjump,deadmeter;
        
        
      public Mario(int x,int y)
      {
          super(x,y,28,50);
          icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
	  this.imgMario = this.icoMario.getImage();
          
          this.jump=false;
          this.countjump=0;
          this.deadmeter=0;
      }

    public Image getImgMario() { return imgMario;}

    public boolean isJump() {return jump;}

    public void setJump(boolean jump) {this.jump = jump;}
      
      
    @Override
 public Image step(String name,int frequances){
        String str;
        ImageIcon ico;
        Image img;
        
        if (super.steps==false)
        {
            if(this.totheright==true)
            {
                str="/images/"+name+"ArretDroite.png";
            }else  { str="/images/"+name+"ArretGauche.png";}
        }else
        {
            this.counter++;
            if (this.counter/frequances==0){
               if (this.totheright==true){str="/images/"+name+"ArretDroite.png";
               }else{str="/images/"+name+"ArretGauche.png";}  
        }else{
             if (this.totheright==true){str="/images/"+name+"MarcheDroite.png";
               }else{str="/images/"+name+"MarcheGauche.png";} 
            } 
            if(this.counter==2*frequances){this.counter=0;}
        }
            ico= new ImageIcon(getClass().getResource(str));
            img=ico.getImage();
            return img;
    }
 
	
    
    
    
    
    public Image jump()
    {
        ImageIcon ico;
        Image img;
        String str;
        
       this.countjump++;
				
       if(this.countjump <= 40){
	if(this.getY() > Main.scene.getHeightceiling())this.setY(this.getY() - 4);
        else this.countjump = 41;			
       if(this.isTotheright()== true)str = "/images/marioSautDroite.png";
       else str = "/images/marioSautGauche.png";	
		
	
       }else if(this.getY() + this.getHeight() < Main.scene.getYjump()){this.setY(this.getY() + 1);
	if(this.isTotheright() == true)str = "/images/marioSautDroite.png";
        else str = "/images/marioSautGauche.png";
			
	
	}else{				
	if(this.isTotheright()== true)str = "/images/marioArretDroite.png";
        else str = "/images/marioArretGauche.png";
			this.jump= false;
			this.countjump = 0;
	}
	
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	
        }
    
   public void contact(Object object) {
		
		if((super.contactAvant(object) == true && this.isTotheright() == true) || (super.contactArriere(object) == true && this.isTotheright() == false)){
			Main.scene.setDx(0);
		    this.setSteps(false);
		}
		       if(super.contactDessous(object) == true && this.jump == true){
			Main.scene.setYjump(object.getY());			
		}else if(super.contactDessous(object) == false){ 
			Main.scene.setYjump(293); 
			if(this.jump== false){this.setY(243);} 
		}
        
        if(super.contactDessus(object) == true){
			Main.scene.setHeightceiling(object.getY() + object.getHeight()); 
		}else if(super.contactDessus(object) == false && this.jump== false){
			Main.scene.setHeightceiling(0);
		}     
	}
	
	public boolean contactpiece(Piece piece){
	
		if(this.contactArriere(piece) == true || this.contactAvant(piece) == true || this.contactDessous(piece) == true || 
		   this.contactDessus(piece) == true){
			return true;			
		}else{return false;}
	}	

	public void contact(Person person) {		
		if((super.contactAvant(person) == true) || (super.contactArriere(person) == true)){
			this.setSteps(false);
		    this.setLiving(false);
		}else if(super.contactDessous(person) == true){
			person.setSteps(false);
			person.setLiving(false);
		}
    }
        
        public Image die(){
        String str;
        ImageIcon ico;
        Image img;
       
        str="/images/boom.png";
        if(this.deadmeter==0) Audio.playSound("/audio/boum.wav");
        if(this.deadmeter==100) Audio.playSound("/audio/partiePerdue.wav");
              
        this.deadmeter++;
        if(this.deadmeter>100)str = "/images/marioMeurt.png";
        this.setY(this.getY()-1);
       
		
        
	ico = new ImageIcon(getClass().getResource(str));
        img = ico.getImage();
        return img;
          }
      
            
}
    
            
  
   
    
    
