package com.daimajia.easing.expo.ExpoEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class ExpoEaseInOut extends BaseEasingMethod	// class@000f9b
{

    public void ExpoEaseInOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       if (!p0) {
          return Float.valueOf(p1);
       }
       if (!p0 - p3) {
          return Float.valueOf((p1 + p2));
       }
       float f = 2.00f;
       p0 = p0 / (p3 / f);
       double d = 2.00f;
       if (p0 - 0x3f800000 < 0) {
          return Float.valueOf((((p2 / f) * (float)Math.pow(d, (double)((p0 - 0x3f800000) * 10.00f))) + p1));
       }
       return Float.valueOf((((p2 / f) * ((- (float)Math.pow(d, (double)((p0 - 0x3f800000) * -10.00f))) + f)) + p1));
    }
}
