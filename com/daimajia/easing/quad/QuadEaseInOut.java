package com.daimajia.easing.quad.QuadEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class QuadEaseInOut extends BaseEasingMethod	// class@000f9f
{

    public void QuadEaseInOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       float f = 2.00f;
       p0 = p0 / (p3 / f);
       if (p0 - 0x3f800000 < 0) {
          return Float.valueOf(((((p2 / f) * p0) * p0) + p1));
       }
       p0 = p0 - 0x3f800000;
       return Float.valueOf(((((- p2) / f) * ((p0 * (p0 - f)) - 0x3f800000)) + p1));
    }
}
