package com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$a;
import android.animation.TimeInterpolator;
import java.lang.Object;

public final class RecyclerTabWithIndicatorView$a implements TimeInterpolator	// class@0018ac
{

    public void RecyclerTabWithIndicatorView$a(){
       super();
    }
    public float getInterpolation(float p0){
       int i = 2;
       float f = (p0 - 0x3f000000 > 0)? (float)3 - ((float)i * p0): (float)1 + (p0 * (float)i);
       return f;
    }
}
