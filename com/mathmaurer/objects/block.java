

package com.mathmaurer.objects;

import javax.swing.ImageIcon;





public class block extends Object
{
      
    
    public block(int x, int y) {
        super(x, y,30,30);
        super.icoobject=new ImageIcon(getClass().getResource("/images/bloc.png"));
        super.imgobject=this.icoobject.getImage();
    }


    
    
    
    
    
}
