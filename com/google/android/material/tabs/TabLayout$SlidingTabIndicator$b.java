package com.google.android.material.tabs.TabLayout$SlidingTabIndicator$b;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator;
import android.animation.Animator;

public class TabLayout$SlidingTabIndicator$b extends AnimatorListenerAdapter	// class@0016c6
{
    public final int a;
    public final TabLayout$SlidingTabIndicator b;

    public void TabLayout$SlidingTabIndicator$b(TabLayout$SlidingTabIndicator p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       TabLayout$SlidingTabIndicator$b tb = this.b;
       tb.e = this.a;
       tb.f = 0;
    }
}
