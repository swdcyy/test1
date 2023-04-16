package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class c$a extends AnimatorListenerAdapter	// class@001ba7
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       c$a ta = this.a;
       if (ta.F != null) {
          return;
       }
       k1.o(ta.K);
       return;
    }
}
