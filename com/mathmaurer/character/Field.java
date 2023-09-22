
package com.mathmaurer.character;


import com.mathmaurer.jeu.Main;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.mathmaurer.objects.Object;

public class Field extends Person implements Runnable{
	
	private Image imgField;
	private ImageIcon icoField;
	
	private final int PAUSE = 15;
	private int dxfield; 
	
	
	
	public Field(int x, int y) {
		
		super(x, y, 27, 30);
		super.setTotheright(true);
		super.setSteps(true);
		this.dxfield = 1;
		
		this.icoField = new ImageIcon(getClass().getResource("/images/champArretGauche.png"));
		this.imgField= this.icoField.getImage();
		
		Thread chronoChamp = new Thread(this);
		chronoChamp.start();
	}

	
			
	public Image getImgField() {return imgField;}

	
	public void move(){ 
    	if(super.isTotheright() == true){this.dxfield = 1;}
    	else{this.dxfield = -1;}
        super.setX(super.getX() + this.dxfield);  	
    }
	
	@Override
	public void run() {
		try{Thread.sleep(20);} 
		catch (InterruptedException e){}		
		
		while(true){	
                    if(this.living==true){
		    this.move();
		    try{Thread.sleep(PAUSE);}
			catch (InterruptedException e){}
                    }
                }
	}
        
        
         public void contact(Object object)
         {
		if((super.contactAvant(object) == true && this.isTotheright()== true)){
		super.setTotheright(false);
		    this.dxfield=-1;
                    
		}else if(super.contactArriere(object) == true && this.isTotheright()==false){ 
			super.setTotheright(true);
                        this.dxfield=1;}
         }
         
          public void contact(Person person)
                  {
		if((super.contactAvant(person) == true && this.isTotheright()== true)){
		super.setTotheright(false);
		    this.dxfield=-1;
                    
		}else if(super.contactArriere(person) == true && this.isTotheright()==false){ 
			super.setTotheright(true);
                        this.dxfield=1;}
 
                  }
          
          public Image die(){
        String str;
        ImageIcon ico;
        Image img;
       
        if(this.isTotheright()== true)str = "/images/champEcraseDroite.png";
        else str = "/images/champEcraseGauche.png";
		
        
	ico = new ImageIcon(getClass().getResource(str));
        img = ico.getImage();
        return img;
          }
  
                
    
}