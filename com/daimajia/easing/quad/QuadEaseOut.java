package com.daimajia.easing.quad.QuadEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class QuadEaseOut extends BaseEasingMethod	// class@000fa0
{

    public void QuadEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = p0 / p3;
       p2 = (- p2) * p0;
       return Float.valueOf(((p2 * (p0 - 2.00f)) + p1));
    }
}
