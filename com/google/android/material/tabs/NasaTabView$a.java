package com.google.android.material.tabs.NasaTabView$a;
import ekd.f$j;
import com.google.android.material.tabs.NasaTabView;
import android.animation.Animator;

public class NasaTabView$a extends f$j	// class@0016bc
{
    public final NasaTabView a;

    public void NasaTabView$a(NasaTabView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.P();
       p0.o = false;
    }
}
