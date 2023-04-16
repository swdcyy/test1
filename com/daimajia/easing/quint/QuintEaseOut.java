package com.daimajia.easing.quint.QuintEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class QuintEaseOut extends BaseEasingMethod	// class@000fa3
{

    public void QuintEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = (p0 / p3) - 0x3f800000;
       return Float.valueOf(((p2 * (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000)) + p1));
    }
}
