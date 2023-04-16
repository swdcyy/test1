package com.daimajia.easing.circ.CircEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class CircEaseInOut extends BaseEasingMethod	// class@000f92
{

    public void CircEaseInOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       float f = 2.00f;
       p0 = p0 / (p3 / f);
       if (p0 - 0x3f800000 < 0) {
          return Float.valueOf(((((- p2) / f) * ((float)Math.sqrt((double)(0x3f800000 - (p0 * p0))) - 0x3f800000)) + p1));
       }
       return Float.valueOf((((p2 / f) * ((float)Math.sqrt((double)(0x3f800000 - ((p0 - f) * (p0 - f)))) + 0x3f800000)) + p1));
    }
}
