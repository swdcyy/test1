package com.daimajia.easing.back.BackEaseIn;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class BackEaseIn extends BaseEasingMethod	// class@000f8b
{
    public float s;

    public void BackEaseIn(float p0){
       super(p0);
       this.s = 0x3fd9cd60;
    }
    public void BackEaseIn(float p0,float p1){
       super(p0);
       this.s = p1;
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = p0 / p3;
       BackEaseIn ts = this.s;
       return Float.valueOf(((((p2 * p0) * p0) * (((0x3f800000 + ts) * p0) - ts)) + p1));
    }
}
