
package com.mathmaurer.character;

import java.awt.Image;
import javax.swing.ImageIcon;
import com.mathmaurer.objects.Object;


import java.awt.Image;

import javax.swing.ImageIcon;

import com.mathmaurer.objects.Object;

public class Turtle extends Person implements Runnable{

	private Image imgTurtle;
	private ImageIcon icoTurtle;
	
	private final int PAUSE = 15; 
	private int dxTurtle; 
	
	
	public Turtle(int x, int y) {
			
		super(x, y, 43, 50);
		super.setTotheright(true);
		super.setSteps(true);
		this.dxTurtle = 1;
			
		this.icoTurtle = new ImageIcon(getClass().getResource("/images/tortueArretGauche.png"));
		this.imgTurtle = this.icoTurtle.getImage();
			
		Thread chronoChamp = new Thread(this);
		chronoChamp.start();
		}
			
	public Image getImgTurtle() {return imgTurtle;}

		
	public void move(){ 
	    if(super.isTotheright() == true){this.dxTurtle = 1;}
	    else{this.dxTurtle = -1;}
	    super.setX(super.getX() + this.dxTurtle);  	
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
	

	public void contact(Object object) {			
		if(super.contactAvant(object) == true && this.isTotheright()== true){					
            super.setTotheright(false);
	    	this.dxTurtle = -1; 
	    }else if(super.contactArriere(object) == true && this.isTotheright() == false){
	    	super.setTotheright(true);
	    	this.dxTurtle = 1;     
	    }	
	}
	
	public void contact(Person person) {		
	    if(super.contactAvant(person) == true && this.isTotheright() == true){					
            super.setTotheright(false);
    	    this.dxTurtle = -1; 
        }else if(super.contactArriere(person) == true && this.isTotheright() == false){
    	    super.setTotheright(true);
    	    this.dxTurtle = 1;     
        }	
    }
         public Image die(){
        String str;
        ImageIcon ico;
        Image img;
       
        str = "/images/tortueFermee.png";
		
        
	ico = new ImageIcon(getClass().getResource(str));
        img = ico.getImage();
        return img;
          }
}