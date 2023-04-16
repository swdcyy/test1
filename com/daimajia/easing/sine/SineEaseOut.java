package com.daimajia.easing.sine.SineEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class SineEaseOut extends BaseEasingMethod	// class@000fa6
{

    public void SineEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       return Float.valueOf(((p2 * (float)Math.sin(((double)(p0 / p3) * 0x3ff921fb54442d18))) + p1));
    }
}
