package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e1a.e;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import java.util.LinkedList;

public class n$c extends AnimatorListenerAdapter	// class@001827
{
    public final LottieAnimationView a;
    public final n b;

    public void n$c(n p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n$c.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       n$c tb = this.b;
       int i = tb.L - 1;
       tb.L = i;
       if (!i) {
          n c = tb.C;
          Objects.requireNonNull(c);
          c.c(0, 0);
       }
       PatchProxy.onMethodExit(n$c.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n$c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.v(this);
       if (this.b.P8().indexOfChild(this.a) > -1) {
          this.a.setVisibility(4);
          if (this.b.K.contains(this.a)) {
             this.b.K.offer(this.a);
          }
       }
       n$c tb = this.b;
       int i = tb.L - 1;
       tb.L = i;
       if (!i) {
          n c = tb.C;
          Objects.requireNonNull(c);
          c.c(0, 0);
       }
       PatchProxy.onMethodExit(n$c.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n$c.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       n$c tb = this.b;
       tb.L = tb.L + 1;
       PatchProxy.onMethodExit(n$c.class, "3");
       return;
    }
}
