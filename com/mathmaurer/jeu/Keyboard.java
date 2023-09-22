
package com.mathmaurer.jeu;

import com.mathmaurer.audio.Audio;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keyboard implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e){
       if(Main.scene.mario.isLiving()==true){
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            if(Main.scene.getXpos()==-1){
                Main.scene.setXpos(0);
                Main.scene.setxFond1(-50);
                Main.scene.setxFond2(750);
                
            }
            Main.scene.mario.setSteps(true);
            Main.scene.mario.setTotheright(true);
           Main.scene.setDx(1);
       }else if((e.getKeyCode()== KeyEvent.VK_LEFT))
       {
            Main.scene.mario.setSteps(true);
            Main.scene.mario.setTotheright(false);
           Main.scene.setDx(-1);
            if(Main.scene.getXpos()==4431){
            Main.scene.setXpos(4430);
            Main.scene.setxFond1(-50);
            Main.scene.setxFond2(750);
       }}
       if((e.getKeyCode()== KeyEvent.VK_SPACE)){
            Main.scene.mario.setJump(true);
            Audio.playSound("/audio/saut.wav");
         }
       
    }
    }
    @Override
    public void keyReleased(KeyEvent e) 
    {   Main.scene.mario.setSteps(false);
        Main.scene.setDx(0);}
      
}

