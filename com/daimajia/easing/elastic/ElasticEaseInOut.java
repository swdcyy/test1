package com.daimajia.easing.elastic.ElasticEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;
import java.lang.Math;

public class ElasticEaseInOut extends BaseEasingMethod	// class@000f98
{

    public void ElasticEaseInOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       if (!p0) {
          return Float.valueOf(p1);
       }
       p0 = p0 / (p3 / 2.00f);
       if (!p0 - 2.00f) {
          return Float.valueOf((p1 + p2));
       }
       float f = 0.45f * p3;
       float f1 = f / 4.00f;
       double d = 2.00f;
       float f2 = 0x3f800000;
       if (p0 - f2 < 0) {
          p0 = p0 - f2;
          return Float.valueOf(((((p2 * (float)Math.pow(d, (double)(10.00f * p0))) * (float)Math.sin((double)((((p0 * p3) - f1) * 0x40c90fdb) / f))) * 0xbf000000) + p1));
       }else {
          p0 = p0 - f2;
          return Float.valueOf(((((((float)Math.pow(d, (double)(-10.00f * p0)) * p2) * (float)Math.sin((double)((((p0 * p3) - f1) * 0x40c90fdb) / f))) * 0x3f000000) + p2) + p1));
       }
    }
}
