

package com.mathmaurer.objects;

import com.mathmaurer.jeu.Main;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Object {
    
    private int large,height,x,y;
    
    protected Image imgobject;
    protected ImageIcon icoobject;


    public Object(int x, int y,int large, int height) {
        this.large = large;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public int getLarge() {return large;}

    public int getHeight() {return height; }

    public int getX() { return x;}

    public int getY() { return y;}

    public Image getImgobject() {return imgobject; }
    
    

    public void setLarge(int large) {this.large = large;  }

    public void setHeight(int height) {this.height = height;}

    public void setX(int x) { this.x = x; }

    public void setY(int y) {this.y = y;}
    
    
    public void deplacement(){
        if(Main.scene.getXpos()>=0)
            this.x-=Main.scene.getDx();
        
    }
    
    
    
    
    
    
}
