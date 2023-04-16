package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import java.util.LinkedList;
import java.util.Objects;
import e1a.e;
import android.animation.Animator;

public class p$c extends AnimatorListenerAdapter	// class@00182e
{
    public final LottieAnimationView a;
    public final p b;

    public void p$c(p p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, p$c.class, "1")) {
          return;
       }
       this.a.v(this);
       if (this.b.R8().indexOfChild(this.a) > -1) {
          this.a.setVisibility(4);
          if (this.b.O.contains(this.a)) {
             this.b.O.offer(this.a);
          }
       }
       p$c tb = this.b;
       int i = tb.P - 1;
       tb.P = i;
       if (i <= 0) {
          tb.P = 0;
          p d = tb.D;
          Objects.requireNonNull(d);
          d.c(0, 0);
       }
       PatchProxy.onMethodExit(p$c.class, "1");
       return;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p$c.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a();
       PatchProxy.onMethodExit(p$c.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p$c.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a();
       PatchProxy.onMethodExit(p$c.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p$c.class, "4")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       PatchProxy.onMethodExit(p$c.class, "4");
       return;
    }
}
