package com.yxcrop.gifshow.v3.editor.text_v3.model.ShiftQT;
import java.io.Serializable;
import java.lang.Double;
import nsd.u;
import java.lang.Object;

public final class ShiftQT implements Serializable	// class@000c15
{
    public Double x;
    public Double y;

    public void ShiftQT(){
       super(null, null, 3, null);
    }
    public void ShiftQT(Double p0,Double p1){
       super();
       this.x = p0;
       this.y = p1;
    }
    public void ShiftQT(Double p0,Double p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final Double getX(){
       return this.x;
    }
    public final Double getY(){
       return this.y;
    }
    public final void setX(Double p0){
       this.x = p0;
    }
    public final void setY(Double p0){
       this.y = p0;
    }
}
