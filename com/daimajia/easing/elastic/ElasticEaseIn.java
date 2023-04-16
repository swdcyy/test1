package com.daimajia.easing.elastic.ElasticEaseIn;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class ElasticEaseIn extends BaseEasingMethod	// class@000f97
{

    public void ElasticEaseIn(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       if (!p0) {
          return Float.valueOf(p1);
       }
       p0 = p0 / p3;
       float f = 0x3f800000;
       if (!p0 - f) {
          return Float.valueOf((p1 + p2));
       }
       float f1 = 0.30f * p3;
       p0 = p0 - f;
       return Float.valueOf(((- ((p2 * (float)Math.pow(2.00f, (double)(10.00f * p0))) * (float)Math.sin((double)((((p0 * p3) - (f1 / 4.00f)) * 0x40c90fdb) / f1)))) + p1));
    }
}
