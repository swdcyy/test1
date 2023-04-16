package com.kwai.yoda.slide.a$a;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class a$a implements Interpolator	// class@0012e7
{

    public void a$a(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
