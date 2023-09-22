
package com.mathmaurer.jeu;

import com.mathmaurer.audio.Audio;
import javax.swing.JFrame;


public class Main {
    
    public static Scene scene;
    
    public static void main(String[]args)
    {
    	JFrame Game=new JFrame("Mario");
        
        Game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Game.setSize(700,360);
        Game.setLocationRelativeTo(null);
        Game.setResizable(false);
        Game.setAlwaysOnTop(true);
        
        scene=new Scene();
        Game.setContentPane(scene);
        Game.setVisible(true);
        
        
    }
}
