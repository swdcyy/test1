package com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SlidePlayVideoLoadingProgressBar$a extends AnimatorListenerAdapter	// class@001a69
{
    public final SlidePlayVideoLoadingProgressBar a;

    public void SlidePlayVideoLoadingProgressBar$a(SlidePlayVideoLoadingProgressBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayVideoLoadingProgressBar$a.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.c();
       SlidePlayVideoLoadingProgressBar l = this.a.l;
       if (l != null) {
          l.onAnimationCancel(p0);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayVideoLoadingProgressBar$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.c();
       SlidePlayVideoLoadingProgressBar l = this.a.l;
       if (l != null) {
          l.onAnimationEnd(p0);
       }
       return;
    }
}
