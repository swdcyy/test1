package com.daimajia.easing.back.BackEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class BackEaseOut extends BaseEasingMethod	// class@000f8d
{
    public float s;

    public void BackEaseOut(float p0){
       super(p0);
       this.s = 0x3fd9cd60;
    }
    public void BackEaseOut(float p0,float p1){
       super(p0);
       this.s = p1;
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = (p0 / p3) - 0x3f800000;
       BackEaseOut ts = this.s;
       return Float.valueOf(((p2 * (((p0 * p0) * (((ts + 0x3f800000) * p0) + ts)) + 0x3f800000)) + p1));
    }
}
