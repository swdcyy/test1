package com.daimajia.easing.linear.Linear;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class Linear extends BaseEasingMethod	// class@000f9d
{

    public void Linear(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       return Float.valueOf((((p2 * p0) / p3) + p1));
    }
}
