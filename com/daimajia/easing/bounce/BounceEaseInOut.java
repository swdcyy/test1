package com.daimajia.easing.bounce.BounceEaseInOut;
import com.daimajia.easing.BaseEasingMethod;
import com.daimajia.easing.bounce.BounceEaseIn;
import com.daimajia.easing.bounce.BounceEaseOut;
import java.lang.Float;

public class BounceEaseInOut extends BaseEasingMethod	// class@000f8f
{
    public BounceEaseIn mBounceEaseIn;
    public BounceEaseOut mBounceEaseOut;

    public void BounceEaseInOut(float p0){
       super(p0);
       this.mBounceEaseIn = new BounceEaseIn(p0);
       this.mBounceEaseOut = new BounceEaseOut(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       if (p0 - (p3 / 2.00f) < 0) {
          return Float.valueOf(((this.mBounceEaseIn.calculate((p0 * 2.00f), 0, p2, p3).floatValue() * 0x3f000000) + p1));
       }
       return Float.valueOf((((this.mBounceEaseOut.calculate(((p0 * 2.00f) - p3), 0, p2, p3).floatValue() * 0x3f000000) + (p2 * 0x3f000000)) + p1));
    }
}
