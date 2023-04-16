package com.google.android.material.tabs.TabLayout$SlidingTabIndicator$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator;
import java.lang.Object;
import android.animation.ValueAnimator;
import rj.a;

public class TabLayout$SlidingTabIndicator$a implements ValueAnimator$AnimatorUpdateListener	// class@0016c5
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final TabLayout$SlidingTabIndicator e;

    public void TabLayout$SlidingTabIndicator$a(TabLayout$SlidingTabIndicator p0,int p1,int p2,int p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       float animatedFrac = p0.getAnimatedFraction();
       int i = a.b(this.a, this.b, animatedFrac);
       this.e.d(i, a.b(this.c, this.d, animatedFrac));
    }
}
