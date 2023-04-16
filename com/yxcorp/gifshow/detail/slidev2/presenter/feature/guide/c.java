package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8a.n;
import java.lang.Runnable;
import android.widget.ImageView;

public class c extends AnimatorListenerAdapter	// class@001986
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       if (ta.F < 3) {
          n on = new n(this);
          ta.E = on;
          ta.s.postDelayed(on, 440);
       }else {
          ta.S8();
       }
       return;
    }
}
