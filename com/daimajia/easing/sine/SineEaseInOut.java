package com.daimajia.easing.sine.SineEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class SineEaseInOut extends BaseEasingMethod	// class@000fa5
{

    public void SineEaseInOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       return Float.valueOf(((((- p2) / 2.00f) * ((float)Math.cos((((double)p0 * 0x400921fb54442d18) / (double)p3)) - 0x3f800000)) + p1));
    }
}
