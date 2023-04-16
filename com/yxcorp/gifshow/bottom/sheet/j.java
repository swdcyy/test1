package com.yxcorp.gifshow.bottom.sheet.j;
import android.view.animation.Interpolator;
import java.lang.Object;
import qa9.p;

public final class j implements Interpolator	// class@001c6c
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
