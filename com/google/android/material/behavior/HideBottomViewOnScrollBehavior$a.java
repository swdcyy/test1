package com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import android.animation.Animator;

public class HideBottomViewOnScrollBehavior$a extends AnimatorListenerAdapter	// class@001634
{
    public final HideBottomViewOnScrollBehavior a;

    public void HideBottomViewOnScrollBehavior$a(HideBottomViewOnScrollBehavior p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.c = null;
    }
}
