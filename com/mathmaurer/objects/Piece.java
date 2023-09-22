
package com.mathmaurer.objects;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Piece extends Object implements Runnable{
    
    private int counter;
    private final int PAUSE=15;
    
      public Piece(int x, int y) {
        super(x, y,30,30);
        super.icoobject=new ImageIcon(getClass().getResource("/images/piece1.png"));
        super.imgobject=this.icoobject.getImage();
    }
      
      
      public Image bouge()
      {
          String str;
          ImageIcon ico;
          Image img;
          
          this.counter++;
          if(this.counter/100==0) str="/images/piece1.png";
          else str="/images/piece2.png";
          if(this.counter==200) this.counter=0;
          ico= new ImageIcon(getClass().getResource(str));
	  img = ico.getImage();
          return img;
      }

    @Override
    public void run() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        
        while(true){
            this.bouge();
        try {
            Thread.sleep(PAUSE);
        } catch (InterruptedException ex) {}
        }
    }
}
