
package com.mathmaurer.objects;


import javax.swing.ImageIcon;


public class Redpipe extends Object {
    
    

    public Redpipe(int x, int y) {
        super(x, y,53,65);
        super.icoobject=new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
        super.imgobject=this.icoobject.getImage();
    }

  
    
    
    
    
    
}
