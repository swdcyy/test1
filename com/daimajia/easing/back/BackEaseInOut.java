package com.daimajia.easing.back.BackEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class BackEaseInOut extends BaseEasingMethod	// class@000f8c
{
    public float s;

    public void BackEaseInOut(float p0){
       super(p0);
       this.s = 0x3fd9cd60;
    }
    public void BackEaseInOut(float p0,float p1){
       super(p0);
       this.s = p1;
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       float f1;
       float f = 2.00f;
       p0 = p0 / (p3 / f);
       double d = 0x3ff8666666666666;
       p3 = 0x3f800000;
       if (p0 - p3 < 0) {
          f1 = (float)((double)this.s * d);
          this.s = f1;
          return Float.valueOf((((p2 / f) * ((p0 * p0) * (((p3 + f1) * p0) - f1))) + p1));
       }else {
          p0 = p0 - f;
          f1 = (float)((double)this.s * d);
          this.s = f1;
          return Float.valueOf((((p2 / f) * (((p0 * p0) * (((p3 + f1) * p0) + f1)) + f)) + p1));
       }
    }
}
