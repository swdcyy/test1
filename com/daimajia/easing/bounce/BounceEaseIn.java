package com.daimajia.easing.bounce.BounceEaseIn;
import com.daimajia.easing.BaseEasingMethod;
import com.daimajia.easing.bounce.BounceEaseOut;
import java.lang.Float;

public class BounceEaseIn extends BaseEasingMethod	// class@000f8e
{
    public BounceEaseOut mBounceEaseOut;

    public void BounceEaseIn(float p0){
       super(p0);
       this.mBounceEaseOut = new BounceEaseOut(p0);
    }
    public Float calculate(float p0,float p1,float p2,float p3){
       return Float.valueOf(((p2 - this.mBounceEaseOut.calculate((p3 - p0), 0, p2, p3).floatValue()) + p1));
    }
}
