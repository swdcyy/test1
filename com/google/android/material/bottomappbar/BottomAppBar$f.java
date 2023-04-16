package com.google.android.material.bottomappbar.BottomAppBar$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import hk.c;

public class BottomAppBar$f implements ValueAnimator$AnimatorUpdateListener	// class@001642
{
    public final BottomAppBar a;

    public void BottomAppBar$f(BottomAppBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.R.o(p0.getAnimatedValue().floatValue());
    }
}
