package com.google.android.material.tabs.NasaTabView$c;
import ekd.f$j;
import com.google.android.material.tabs.NasaTabView;
import android.animation.Animator;
import android.view.View;
import com.yxcorp.utility.n;

public class NasaTabView$c extends f$j	// class@0016be
{
    public final NasaTabView a;

    public void NasaTabView$c(NasaTabView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.p = false;
    }
    public void onAnimationEnd(Animator p0){
       View[] viewArray = new View[]{this.a.w};
       n.Z(8, viewArray);
       viewArray.p = false;
    }
    public void onAnimationStart(Animator p0){
       p0.p = true;
    }
}
