package com.yxcorp.gifshow.detail.fragments.milano.presenter.d$e;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class d$e implements Animator$AnimatorListener	// class@001524
{
    public final View a;
    public final boolean b;
    public final d c;

    public void d$e(d p0,View p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "2")) {
          return;
       }
       if (this.b != null) {
          k1.r(this.c.P, 5000);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "1")) {
          return;
       }
       d$e ta = this.a;
       if (ta != null && ta.getVisibility() == 4) {
          this.a.setVisibility(0);
          this.a.setClickable(true);
       }
       return;
    }
}
