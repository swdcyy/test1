package com.yxcorp.gifshow.activity.share.presenter.t2;
import android.animation.TimeInterpolator;
import java.lang.Object;
import java.lang.Math;

public final class t2 implements TimeInterpolator	// class@001433
{
    public static final t2 a;

    static {
       t2.a = new t2();
    }
    public void t2(){
       super();
    }
    public final float getInterpolation(float p0){
       return (float)(0x3ff0000000000000 - Math.pow((double)(0x3f800000 - p0), 3.00f));
    }
}
