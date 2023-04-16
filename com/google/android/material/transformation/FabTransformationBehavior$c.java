package com.google.android.material.transformation.FabTransformationBehavior$c;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.material.circularreveal.c;
import android.graphics.drawable.Drawable;
import android.animation.Animator;

public class FabTransformationBehavior$c extends AnimatorListenerAdapter	// class@0016ed
{
    public final c a;
    public final Drawable b;
    public final FabTransformationBehavior c;

    public void FabTransformationBehavior$c(FabTransformationBehavior p0,c p1,Drawable p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.setCircularRevealOverlayDrawable(null);
    }
    public void onAnimationStart(Animator p0){
       this.a.setCircularRevealOverlayDrawable(this.b);
    }
}
