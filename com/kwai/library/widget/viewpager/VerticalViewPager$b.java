package com.kwai.library.widget.viewpager.VerticalViewPager$b;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class VerticalViewPager$b implements Interpolator	// class@000a79
{

    public void VerticalViewPager$b(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
