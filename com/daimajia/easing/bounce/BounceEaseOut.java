package com.daimajia.easing.bounce.BounceEaseOut;
import com.daimajia.easing.BaseEasingMethod;
import java.lang.Float;

public class BounceEaseOut extends BaseEasingMethod	// class@000f90
{

    public void BounceEaseOut(float p0){
       super(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       p0 = p0 / p3;
       p3 = 0x40f20000;
       if (p0 - 0x3eba2e8c < 0) {
          return Float.valueOf(((p2 * ((p3 * p0) * p0)) + p1));
       }
       if (p0 - 0x3f3a2e8c < 0) {
          p0 = p0 - 0x3f0ba2e9;
          p3 = (p3 * p0) * p0;
          return Float.valueOf(((p2 * (p3 + 0x3f400000)) + p1));
       }else if((double)p0 - 0x3fed1745d1745d17 < 0){
          p0 = p0 - 0x3f51745d;
          p3 = (p3 * p0) * p0;
          return Float.valueOf(((p2 * (p3 + 0x3f700000)) + p1));
       }else {
          p0 = p0 - 0x3f745d17;
          p3 = (p3 * p0) * p0;
          return Float.valueOf(((p2 * (p3 + 0x3f7c0000)) + p1));
       }
    }
}
