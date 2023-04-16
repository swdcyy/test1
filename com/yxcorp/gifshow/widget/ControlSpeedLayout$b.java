package com.yxcorp.gifshow.widget.ControlSpeedLayout$b;
import java.lang.Object;

public class ControlSpeedLayout$b	// class@00180a
{
    public int a;
    public int b;

    public void ControlSpeedLayout$b(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof ControlSpeedLayout$b) {
          return b;
       }
       if (this.a == p0.a && this.b == p0.b) {
          b = true;
       }
       return b;
    }
}
