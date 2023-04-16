package com.daimajia.easing.expo.ExpoEaseIn;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class ExpoEaseIn extends BaseEasingMethod	// class@000f9a
{

    public void ExpoEaseIn(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       if (!p0) {
       }else {
          p1 = p1 + (p2 * (float)Math.pow(2.00f, (double)(((p0 / p3) - 0x3f800000) * 10.00f)));
       }
       return Float.valueOf(p1);
    }
}
