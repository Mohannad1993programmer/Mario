
package com.mathmaurer.display;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Countdown implements Runnable {

    private final int PAUSE=1000;
    private int countertime;
    private String str;

    public Countdown() {
        this.countertime = 100;
        this.str = "Time Remainder : 100";
        Thread countertime=new Thread(this);
        countertime.start();
    }

    public int getCountertime() {return countertime;}

    public String getStr() { return str;}
    
    
    
    
    
    
    
    public void run() {
        while(true){
        try {
            Thread.sleep(PAUSE);
        } catch (InterruptedException e) {}
          this.countertime--;
          this.str="Time remainder: "+this.countertime;
        }
    }
    
}
