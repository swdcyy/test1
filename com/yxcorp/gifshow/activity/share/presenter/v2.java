package com.yxcorp.gifshow.activity.share.presenter.v2;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Math;

public final class v2 implements Interpolator	// class@00143e
{
    public static final v2 a;

    static {
       v2.a = new v2();
    }
    public void v2(){
       super();
    }
    public final float getInterpolation(float p0){
       return (float)(0x3ff0000000000000 - Math.pow((double)(0x3f800000 - p0), 3.00f));
    }
}
