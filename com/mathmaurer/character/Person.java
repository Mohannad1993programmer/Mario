
package com.mathmaurer.character;

import com.mathmaurer.objects.Object;
import com.mathmaurer.jeu.Main;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Person {
    
    private int large,height,x,y;
    public int counter;
    protected boolean steps;
    protected boolean totheright;
    protected boolean living;

    public Person(int x, int y,int large, int height) {
        this.large = large;
        this.height = height;
        this.x = x;
        this.y = y;
        this.counter = 0;
        this.steps = false;
        this.totheright = true;
        this.living=true;
    }

    public int getLarge() {return large;}
  
    public int getHeight() {return height;}
  
    public int getX() {return x;}
  
    public int getY() {return y;}
   
    public int getCounter() {return counter;}
   
    public boolean isSteps() { return steps;}
    
    public boolean isTotheright() { return totheright;}

    public boolean isLiving() {return living;}
    
    public void setLarge(int large) {this.large = large;}

    public void setHeight(int height) {this.height = height;}
    
    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    public void setCounter(int counter) {this.counter = counter;}

    public void setSteps(boolean steps) {this.steps = steps;}

    public void setTotheright(boolean totheright) {this.totheright = totheright;}

    public void setLiving(boolean living) {this.living = living;}
    
    
    
    
    
    public Image step(String name,int frequances){
        String str;
        ImageIcon ico;
        Image img;
        
        if (this.steps==false)
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
    
    
      public void deplacement(){
        if(Main.scene.getXpos()>=0)
            this.x-=Main.scene.getDx();
        
    }
  
 
    
   
    protected boolean contactAvant(Object object){
	    if(this.x + this.large < object.getX() || this.x + this.large > object.getX() + 5 ||
	       this.y + this.height <= object.getY() || this.y >= object.getY() + object.getHeight()){return false;}
		else{return true;}
	} 
    

    protected boolean contactArriere(Object object){		
		if(this.x > object.getX() + object.getLarge() || this.x + this.large < object.getX() + object.getLarge()- 5 || 
		   this.y + this.height <= object.getY() || this.y >= object.getY() + object.getHeight()){return false;}
		else{return true;}
	}


    protected boolean contactDessous(Object object){		
		if(this.x + this.large< object.getX() + 5 || this.x > object.getX() + object.getLarge()- 5 || 
		   this.y + this.height < object.getY() || this.y + this.height > object.getY() + 5){return false;}
		else{return true;}		
	}

  
    protected boolean contactDessus(Object object){
		if(this.x + this.large < object.getX() + 5 || this.x > object.getX() + object.getLarge() - 5 || 
		   this.y < object.getY() + object.getHeight() || this.y > object.getY() + object.getHeight() + 5){return false;}
		else{return true;}
	}   
    
    public boolean proche(Object object){  	
    	if((this.x > object.getX() - 10 && this.x < object.getX() + object.getLarge() + 10) 
    	|| (this.x + this.large > object.getX() - 10 && this.x + this.large < object.getX() + object.getLarge() + 10)){return true;}
    	else{return false;}
    }
    
    protected boolean contactAvant(Person person){
		if(this.isTotheright() == true){
			if(this.x + this.large < person.getX() || this.x + this.large > person.getX() + 5 || 
			   this.y + this.height <= person.getY() || this.y >= person.getY() + person.getHeight()){return false;}
			else{return true;}
		}else{return false;}
	} 
    
    protected boolean contactArriere(Person person){	
		if(this.x > person.getX() + person.getLarge() || this.x + this.large < person.getX() + person.getLarge() - 5 || 
		   this.y + this.height <= person.getY() || this.y >= person.getY() + person.getHeight()){return false;}
		else{return true;}
	}
    
    
    protected boolean contactDessous(Person person){		
	if(this.x + this.large < person.getX() || this.x > person.getX() + person.getLarge()  || 
		   this.y +this.height< person.getY()|| this.y+this.height > person.getY()){return false;}
		else{return true;}
	}
    
    
    public boolean proche(Person person){  	
    	if((this.x > person.getX() - 10 && this.x < person.getX() + person.getLarge() + 10) 
    	|| (this.x + this.large > person.getX() - 10 && this.x + this.large< person.getX() + person.getLarge() + 10)){
    	return true;}
    	else{return false;}
    }
}
         
        
    
            
