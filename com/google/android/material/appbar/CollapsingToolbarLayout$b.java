package com.google.android.material.appbar.CollapsingToolbarLayout$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public class CollapsingToolbarLayout$b implements ValueAnimator$AnimatorUpdateListener	// class@00161a
{
    public final CollapsingToolbarLayout a;

    public void CollapsingToolbarLayout$b(CollapsingToolbarLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.setScrimAlpha(p0.getAnimatedValue().intValue());
    }
}
