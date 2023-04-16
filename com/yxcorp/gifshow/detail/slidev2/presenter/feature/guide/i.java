package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.i;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8a.d0;
import java.lang.Runnable;
import android.widget.ImageView;
import uw9.o;
import q87.c;

public class i extends AnimatorListenerAdapter	// class@001993
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       i ta = this.a;
       if (ta.I < 3 && !ta.X8()) {
          ta = this.a;
          d0 uod0 = new d0(this);
          ta.H = uod0;
          ta.s.postDelayed(uod0, 440);
       }else {
          Object[] objArray = new Object[0];
          o.C().w("SlidePlayLeftSlideGuide", "onAnimationEnd", objArray);
          this.a.R8();
       }
       return;
    }
}
