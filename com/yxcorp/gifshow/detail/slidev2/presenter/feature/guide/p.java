package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.p;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8a.n1;
import java.lang.Runnable;
import android.widget.ImageView;

public class p extends AnimatorListenerAdapter	// class@0019a2
{
    public final o a;

    public void p(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       p ta = this.a;
       if (ta.B < 3) {
          n1 on1 = new n1(this);
          ta.J = on1;
          ta.r.postDelayed(on1, 480);
       }else {
          ta.R8();
       }
       return;
    }
}
