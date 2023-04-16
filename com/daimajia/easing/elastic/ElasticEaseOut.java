package com.daimajia.easing.elastic.ElasticEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class ElasticEaseOut extends BaseEasingMethod	// class@000f99
{

    public void ElasticEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       if (!p0) {
          return Float.valueOf(p1);
       }
       p0 = p0 / p3;
       if (!p0 - 0x3f800000) {
          return Float.valueOf((p1 + p2));
       }
       float f = 0.30f * p3;
       return Float.valueOf((((((float)Math.pow(2.00f, (double)(-10.00f * p0)) * p2) * (float)Math.sin((double)((((p0 * p3) - (f / 4.00f)) * 0x40c90fdb) / f))) + p2) + p1));
    }
}
