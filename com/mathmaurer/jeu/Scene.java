package com.mathmaurer.jeu;


import com.mathmaurer.audio.Audio;
import com.mathmaurer.character.Field;
import  com.mathmaurer.objects.Object;
import com.mathmaurer.character.Mario;
import com.mathmaurer.character.Turtle;
import com.mathmaurer.display.Countdown;
import com.mathmaurer.display.Score;
import com.mathmaurer.objects.Piece;
import com.mathmaurer.objects.Redpipe;
import com.mathmaurer.objects.block;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond;
	private Image imgFond1;
        private Image imgFond2;
        
        
	private ImageIcon icoChateau1;
	private Image imgChateau1; 
	private ImageIcon icoDepart;
	private Image imgDepart; 
        
        private Image imgchateauFin;
        private ImageIcon icochateauFin;
	 
        
        private ImageIcon icodrapeau;
	private Image imgdrapeau; 
        
        public Mario mario;
    
        
        
       
       private ArrayList<Object> tabobject;
       private ArrayList<Piece> tabpiece;
       private ArrayList<Field> tabfield;
       private ArrayList<Turtle> tabturtle;
       
       private Score score;
       private Font line;
       private Countdown countdown;
       private boolean ok;
       
       private int xFond1, xFond2, dx, xpos, yjump,heightceiling;
	
        public Redpipe redpipe1;
        public Redpipe redpipe2;
        public Redpipe redpipe3;
        public Redpipe redpipe4;
        public Redpipe redpipe5;
        public Redpipe redpipe6;
        public Redpipe redpipe7;
        public Redpipe redpipe8;
        
        
        public block block1;
        public block block2;
        public block block3;
        public block block4;
        public block block5;
        public block block6;
        public block block7;
        public block block8;
        public block block9;
        public block block10;
        public block block11;
        public block block12;
        
        public Piece piece1;
        public Piece piece2;
        public Piece piece3;
        public Piece piece4;
        public Piece piece5;
        public Piece piece6;
        public Piece piece7;
        public Piece piece8;
        public Piece piece9;
        public Piece piece10;
        public Piece piece11;
        public Piece piece12;
        
        public Field field1;
        public Field field2;
        public Field field3;
        public Field field4;
        public Field field5;
        public Field field6;
        public Field field7;
        public Field field8;
        
        public Turtle turtle1;
        public Turtle turtle2;
        public Turtle turtle3;
        public Turtle turtle4;
        public Turtle turtle5;
        public Turtle turtle6;
        public Turtle turtle7;
        public Turtle turtle8;
        public Turtle turtle9;
        
        
        
        
		
	public Scene(){
		
		super();
		
		this.xFond1 = -50;
                this.xFond2= 750;
		this.dx = 0;
                this.xpos=-1;
                this.yjump=293;
                this.heightceiling=0;
                this.ok=true;
		
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage();
                this.imgFond2 = this.icoFond.getImage();
		//icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
		//this.imgMario = this.icoMario.getImage();
		
                icoChateau1 = new ImageIcon(getClass().getResource("/images/chateau1.png"));
		this.imgChateau1 = this.icoChateau1.getImage();
		icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart = this.icoDepart.getImage();
                
                mario = new Mario(300, 245);
		//field = new Field(650, 263);
		//turtle = new Turtle(850, 243); 
                
                redpipe1=new Redpipe(600,230);
                redpipe2=new Redpipe(1000,230);
                redpipe3=new Redpipe(1600,230);
                redpipe4=new Redpipe(1900,230);
                redpipe5=new Redpipe(2500,230);
                redpipe6=new Redpipe(3000,230);
                redpipe7=new Redpipe(3800,230);
                redpipe8=new Redpipe(4000,230);
                
                block1=new block(400,180);
                block2=new block(1200,180);
                block3=new block(1270,170);
                block4=new block(1340,160);
                block5=new block(2000,180);
                block6=new block(2600,160);
                block7=new block(2650,180);
                block8=new block(3500,160);
                block9=new block(3550,140);
                block10=new block(4100,170);
                block11=new block(4200,210);
                block12=new block(4300,170);
		
                piece1=new Piece(402,145);
                piece2=new Piece(1202,140);
                piece3=new Piece(1272,95);
                piece4=new Piece(1342,40);
                piece5=new Piece(1650,145);
                piece6=new Piece(2650,145);
                piece7=new Piece(3000,135);
                piece8=new Piece(3400,125);
                piece9=new Piece(4200,145);
                piece10=new Piece(4300,140);
                
                field1=new Field(750,263);
                field2=new Field(1100,263);
                field3=new Field(2100,263);
                field4=new Field(2400,263);
                field5=new Field(3200,263);
                field6=new Field(3500,263);
                field7=new Field(3700,263);
                field8=new Field(4500,263);
                
                turtle1=new Turtle(900,243);
                turtle2=new Turtle(1500,243);
                turtle3=new Turtle(1800,243);
                turtle4=new Turtle(2400,243);
                turtle5=new Turtle(3100,243);
                turtle6=new Turtle(3600,243);
                turtle7=new Turtle(3900,243);
                turtle8=new Turtle(4200,243);
                turtle9=new Turtle(4400,243);
                
           
                this.icochateauFin = new ImageIcon(getClass().getResource("/images/chateauFin.png"));
		this.imgchateauFin = this.icochateauFin.getImage();
                
                this.icodrapeau= new ImageIcon(getClass().getResource("/images/drapeau.png"));
		this.imgdrapeau = this.icodrapeau.getImage();
                
                tabobject=new ArrayList<Object>();
                tabpiece=new ArrayList<Piece>();
                tabfield=new ArrayList<Field>();
                tabturtle=new ArrayList<Turtle>();
                
                this.tabobject.add(this.redpipe1);
                this.tabobject.add(this.redpipe2);
                this.tabobject.add(this.redpipe3);
                this.tabobject.add(this.redpipe4);
                this.tabobject.add(this.redpipe5);
                this.tabobject.add(this.redpipe6);
                this.tabobject.add(this.redpipe7);
                this.tabobject.add(this.redpipe8);
                
                this.tabobject.add(this.block1);
                this.tabobject.add(this.block2);
                this.tabobject.add(this.block3);
                this.tabobject.add(this.block4);
                this.tabobject.add(this.block5);
                this.tabobject.add(this.block6);
                this.tabobject.add(this.block7);
                this.tabobject.add(this.block8);
                this.tabobject.add(this.block9);
                this.tabobject.add(this.block10);
                this.tabobject.add(this.block11);
                this.tabobject.add(this.block12);
                
                this.tabpiece.add(this.piece1);
                this.tabpiece.add(this.piece2);
                this.tabpiece.add(this.piece3);
                this.tabpiece.add(this.piece4);
                this.tabpiece.add(this.piece5);
                this.tabpiece.add(this.piece6);
                this.tabpiece.add(this.piece7);
                this.tabpiece.add(this.piece8);
                this.tabpiece.add(this.piece9);
                this.tabpiece.add(this.piece10);
                
                this.tabfield.add(this.field1);
                this.tabfield.add(this.field2);
                this.tabfield.add(this.field3);
                this.tabfield.add(this.field4);
                this.tabfield.add(this.field5);
                this.tabfield.add(this.field6);
                this.tabfield.add(this.field7);
                this.tabfield.add(this.field8);
                
                this.tabturtle.add(this.turtle1);
                this.tabturtle.add(this.turtle2);
                this.tabturtle.add(this.turtle3);
                this.tabturtle.add(this.turtle4);
                this.tabturtle.add(this.turtle5);
                this.tabturtle.add(this.turtle6);
                this.tabturtle.add(this.turtle7);
                this.tabturtle.add(this.turtle8);
                this.tabturtle.add(this.turtle9);
                
                
                
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());
                
                score=new Score();
                line=new Font("Arial",Font.ITALIC,18);
                countdown=new Countdown();
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}
	
	
		
	public int getDx() {return dx;}

        public int getXpos() {return xpos;  }

        public void setXpos(int xpos){this.xpos = xpos;}
        
	public void setDx(int dx) {this.dx = dx;}

        public int getYjump() {return yjump;}

        public int getHeightceiling() {return heightceiling;}
        
        

        public void setxFond1(int xFond1) { this.xFond1 = xFond1;}
        public void setxFond2(int xFond2) { this.xFond2 = xFond2;}
        public void setHeightceiling(int heightceiling){this.heightceiling = heightceiling;}
        public void setYjump(int yjump) {this.yjump = yjump;}
        
        
        
        
        
        
        
	public void deplacementFond()
        {
            
            if(this.xpos >= 0){// && this.xpos <= 4430){
                this.xpos+=this.dx;
                this.xFond1-=this.dx;
                this.xFond2-=this.dx;}
            
            if(this.xFond1==-800)     this.xFond1=800;
            else if(this.xFond2==-800)this.xFond2=800;
            else if(this.xFond1==800) this.xFond1=-800;
            else if(this.xFond2==800) this.xFond2=-800;
        }
        
        private boolean Gamewon()
        {
            if(this.countdown.getCountertime()> 0 && this.mario.isLiving()==true && this.score.getNbrepiece()==10 && this.xpos>4400)
            {if(this.ok==true) {
                 Audio.playSound("/audio/partieGagnee.wav");
                  this.ok=false;
             }
            
               return true;
        }else return false;
        }
        
        private boolean Gamelost()
        {
            if(this.countdown.getCountertime()<= 0 || this.mario.isLiving()==false)
                return true;
            else return false;
        }
        
        public boolean Gameover()
        {
            if(this.Gamelost()==true || this.Gamewon()==true)
                return true;
            else return false;   
        }
        
        


	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
                
                for(int i = 0; i < this.tabobject.size(); i++){
		    if(this.mario.proche(this.tabobject.get(i))){this.mario.contact(this.tabobject.get(i));}
                   
                     for(int j = 0; j < this.tabfield.size(); j++)
                    if(this.tabfield.get(j).proche(this.tabobject.get(i))){this.tabfield.get(j).contact(this.tabobject.get(i));}
                    
                      for(int j = 0; j < this.tabturtle.size(); j++)
                     if(this.tabturtle.get(j).proche(this.tabobject.get(i))){this.tabturtle.get(j).contact(this.tabobject.get(i));}
                
                }
                
                  for(int i = 0; i < this.tabpiece.size(); i++){
		   if(this.mario.proche(this.tabpiece.get(i)))
                        if(this.mario.contactpiece(this.tabpiece.get(i))){
                           Audio.playSound("/audio/piece.wav");
                           this.tabpiece.remove(i);
                           this.score.setNbrepiece(this.score.getNbrepiece()+1);
                        }
                           
                  }
		
		
		
		for(int i = 0; i < this.tabfield.size(); i++){
                    for(int j = 0; j < this.tabfield.size(); j++){
                        if(j!=i)
                             if(this.tabfield.get(j).proche(this.tabfield.get(i))){this.tabfield.get(j).contact(this.tabfield.get(i));}
                    }
                    
                    for(int j = 0; j < this.tabturtle.size(); j++)
                         if(this.tabturtle.get(j).proche(this.tabfield.get(i))){this.tabturtle.get(j).contact(this.tabfield.get(i));}
                }
                
                for(int i = 0; i < this.tabturtle.size(); i++){
                    for(int j = 1; j < this.tabturtle.size(); j++){
                        if(j!=i)
                            if(this.tabturtle.get(j).proche(this.tabturtle.get(i))){this.tabturtle.get(j).contact(this.tabturtle.get(i));}
                    }
                    
                     for(int j = 0; j < this.tabfield.size(); j++)
                         if(this.tabfield.get(j).proche(this.tabturtle.get(i))){this.tabfield.get(j).contact(this.tabturtle.get(i));}
                }
                    
                    
                    

                for(int i=0;i<this.tabfield.size();i++)
	        if(this.mario.proche(this.tabfield.get(i)) && this.tabfield.get(i).isLiving() == true){this.mario.contact(this.tabfield.get(i));
                if(this.tabfield.get(i).isLiving()==false) Audio.playSound("/audio/ecrasePersonnage.wav");
                }
 	 	
                for(int i=0;i<this.tabturtle.size();i++)
                if(this.mario.proche(this.tabturtle.get(i)) && this.tabturtle.get(i).isLiving() == true){this.mario.contact(this.tabturtle.get(i));
                 if(this.tabturtle.get(i).isLiving()==false) Audio.playSound("/audio/ecrasePersonnage.wav");
               
                }
                
		this.deplacementFond();
		if(this.xpos >= 0 && this.xpos <= 4430){
		    for(int i = 0; i < this.tabobject.size(); i++){this.tabobject.get(i).deplacement();}
                    for(int i = 0; i < this.tabpiece.size(); i++){this.tabpiece.get(i).deplacement();}
                    for(int i = 0; i < this.tabfield.size(); i++){this.tabfield.get(i).deplacement();}
                    for(int i = 0; i < this.tabturtle.size(); i++){this.tabturtle.get(i).deplacement();}
                }
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
		
		
 		g2.drawImage(this.imgChateau1, 10 - this.xpos, 95, null);

 		g2.drawImage(this.imgDepart, 220 - this.xpos, 234, null);

     	
 	 	for(int i = 0; i < this.tabobject.size(); i++){
 	 		g2.drawImage(this.tabobject.get(i).getImgobject(), this.tabobject.get(i).getX(), this.tabobject.get(i).getY(), null);
 	 	}	
                
                
 	 	for(int i = 0; i < this.tabpiece.size(); i++){
 	 		g2.drawImage(this.tabpiece.get(i).bouge(), this.tabpiece.get(i).getX(), this.tabpiece.get(i).getY(), null);
 	 	}	
 	 	 	 	
 	
 	 	g2.drawImage(imgdrapeau, 4650 - this.xpos, 115, null);
 	    
 		g2.drawImage(imgchateauFin, 5000 - this.xpos, 145, null);
                
                if(this.mario.isLiving()==true)
                {
                 if(this.mario.isJump()){g2.drawImage(this.mario.jump(), this.mario.getX(), this.mario.getY(), null);}
 	         else{g2.drawImage(this.mario.step("mario", 50), this.mario.getX(), this.mario.getY(), null);}	
                }else g2.drawImage(this.mario.die(), this.mario.getX(), this.mario.getY(), null);	
 	 	
                for(int i=0;i<this.tabfield.size();i++){
                if(this.tabfield.get(i).isLiving()==true)
                g2.drawImage(this.tabfield.get(i).step("champ", 45), this.tabfield.get(i).getX(), this.tabfield.get(i).getY(), null);
                else g2.drawImage(this.tabfield.get(i).die(), this.tabfield.get(i).getX(), this.tabfield.get(i).getY()+20, null);
                }
                
                for(int i=0;i<this.tabturtle.size();i++){
                if(this.tabturtle.get(i).isLiving()==true)
                g2.drawImage(this.tabturtle.get(i).step("tortue", 50), this.tabturtle.get(i).getX(), this.tabturtle.get(i).getY(), null);
                else g2.drawImage(this.tabturtle.get(i).die(), this.tabturtle.get(i).getX(), this.tabturtle.get(i).getY()+30, null);
                }
                
                
              
               g2.setFont(line);
               g2.drawString(this.score.getNbrepiece()+" Pieces(s) Found(s) on "+this.score.getNbretotalprice(), 460, 25);
                
               g2.drawString(this.countdown.getStr(),5,25);
               
               
               if(this.Gameover()==true){
                   line=new Font("Arial",Font.BOLD,18);
                   g2.setFont(line);
                   if(this.Gamewon()==true) g2.drawString("you win the game !!", 220, 150);
                   else g2.drawString("you lose the game !!", 220, 150);
               
               }
                   
                   
                   
        }
        
        }

