package com.kwai.library.widget.pageindicator.PagerIndicator$e;
import android.view.animation.Interpolator;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$a;
import java.lang.Math;

public class PagerIndicator$e implements Interpolator	// class@00096f
{
    public final PagerIndicator a;

    public void PagerIndicator$e(PagerIndicator p0){
       this.a = p0;
       super();
    }
    public void PagerIndicator$e(PagerIndicator p0,PagerIndicator$a p1){
       super(p0);
    }
    public float getInterpolation(float p0){
       return Math.abs((0x3f800000 - p0));
    }
}
