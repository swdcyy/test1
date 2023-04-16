package com.google.android.material.tabs.TabLayout$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.TabLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.widget.HorizontalScrollView;

public class TabLayout$a implements ValueAnimator$AnimatorUpdateListener	// class@0016c9
{
    public final TabLayout a;

    public void TabLayout$a(TabLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.scrollTo(p0.getAnimatedValue().intValue(), 0);
    }
}
