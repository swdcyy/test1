package com.yxcorp.gifshow.activity.share.presenter.p2;
import android.animation.TimeInterpolator;
import java.lang.Object;
import java.lang.Math;

public final class p2 implements TimeInterpolator	// class@001422
{
    public static final p2 a;

    static {
       p2.a = new p2();
    }
    public void p2(){
       super();
    }
    public final float getInterpolation(float p0){
       return (float)(0x3ff0000000000000 - Math.pow((double)(0x3f800000 - p0), 3.00f));
    }
}
