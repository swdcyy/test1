package com.daimajia.easing.circ.CircEaseIn;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class CircEaseIn extends BaseEasingMethod	// class@000f91
{

    public void CircEaseIn(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       return Float.valueOf((((- p2) * ((float)Math.sqrt((double)(0x3f800000 - ((p0 / p3) * (p0 / p3)))) - 0x3f800000)) + p1));
    }
}
