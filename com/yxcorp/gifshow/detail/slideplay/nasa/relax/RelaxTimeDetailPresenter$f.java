package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$f;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import android.animation.Animator;

public class RelaxTimeDetailPresenter$f extends AnimatorListenerAdapter	// class@0017b0
{
    public final RelaxTimeDetailPresenter a;

    public void RelaxTimeDetailPresenter$f(RelaxTimeDetailPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       RelaxTimeDetailPresenter$f ta = this.a;
       ta.L = false;
       ta.M = true;
    }
}
