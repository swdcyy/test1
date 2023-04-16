package com.google.android.material.tabs.NasaTabView$b;
import ekd.f$j;
import com.google.android.material.tabs.NasaTabView;
import android.animation.Animator;
import android.widget.FrameLayout;

public class NasaTabView$b extends f$j	// class@0016bd
{
    public final NasaTabView a;

    public void NasaTabView$b(NasaTabView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.p = false;
    }
    public void onAnimationEnd(Animator p0){
       NasaTabView$b ta = this.a;
       ta.p = false;
       ta.invalidate();
    }
    public void onAnimationStart(Animator p0){
       p0.p = true;
    }
}
