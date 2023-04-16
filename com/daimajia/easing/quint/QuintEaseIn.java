package com.daimajia.easing.quint.QuintEaseIn;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class QuintEaseIn extends BaseEasingMethod	// class@000fa1
{

    public void QuintEaseIn(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = p0 / p3;
       return Float.valueOf(((((((p2 * p0) * p0) * p0) * p0) * p0) + p1));
    }
}
