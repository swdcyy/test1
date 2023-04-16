package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.l;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8a.u0;
import java.lang.Runnable;
import android.widget.ImageView;

public class l extends AnimatorListenerAdapter	// class@001999
{
    public final k a;

    public void l(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       l ta = this.a;
       if (ta.J < 3) {
          u0 ou0 = new u0(this);
          ta.R = ou0;
          ta.r.postDelayed(ou0, 480);
       }else {
          ta.V8();
       }
       return;
    }
}
