package com.yxcorp.gifshow.ad.award.ui.ShineView$a;
import ekd.f$j;
import com.yxcorp.gifshow.ad.award.ui.ShineView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class ShineView$a extends f$j	// class@00152c
{
    public final ShineView a;

    public void ShineView$a(ShineView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShineView$a.class, "1")) {
          return;
       }
       ShineView$a ta = this.a;
       int i = ta.r + 1;
       ta.r = i;
       ShineView q = ta.q;
       if (i < q || q < null) {
          k1.r(ta.s, ta.n);
       }
       return;
    }
}
