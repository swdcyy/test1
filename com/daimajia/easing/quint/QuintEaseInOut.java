package com.daimajia.easing.quint.QuintEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class QuintEaseInOut extends BaseEasingMethod	// class@000fa2
{

    public void QuintEaseInOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = p0 / (p3 / 2.00f);
       if (p0 - 0x3f800000 < 0) {
          return Float.valueOf((((((((p2 / 2.00f) * p0) * p0) * p0) * p0) * p0) + p1));
       }
       p0 = p0 - 2.00f;
       return Float.valueOf((((p2 / 2.00f) * (((((p0 * p0) * p0) * p0) * p0) + 2.00f)) + p1));
    }
}