package com.daimajia.easing.expo.ExpoEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class ExpoEaseOut extends BaseEasingMethod	// class@000f9c
{

    public void ExpoEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p1 = (!p0 - p3)? p1 + p2: p1 + (p2 * ((- (float)Math.pow(2.00f, (double)((p0 * -10.00f) / p3))) + 0x3f800000));
       return Float.valueOf(p1);
    }
}
