package com.google.android.material.bottomappbar.BottomAppBar$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import tj.a;
import android.graphics.drawable.Drawable;

public class BottomAppBar$b implements ValueAnimator$AnimatorUpdateListener	// class@00163e
{
    public final BottomAppBar a;

    public void BottomAppBar$b(BottomAppBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.S.k(p0.getAnimatedValue().floatValue());
       this.a.R.invalidateSelf();
    }
}
