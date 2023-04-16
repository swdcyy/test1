package com.daimajia.easing.circ.CircEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class CircEaseOut extends BaseEasingMethod	// class@000f93
{

    public void CircEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       return Float.valueOf(((p2 * (float)Math.sqrt((double)(0x3f800000 - (((p0 / p3) - 0x3f800000) * ((p0 / p3) - 0x3f800000))))) + p1));
    }
}
