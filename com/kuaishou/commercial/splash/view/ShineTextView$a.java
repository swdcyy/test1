package com.kuaishou.commercial.splash.view.ShineTextView$a;
import ekd.f$j;
import com.kuaishou.commercial.splash.view.ShineTextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class ShineTextView$a extends f$j	// class@001634
{
    public final ShineTextView a;

    public void ShineTextView$a(ShineTextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShineTextView$a.class, "1")) {
          return;
       }
       ShineTextView$a ta = this.a;
       int i = ta.q + 1;
       ta.q = i;
       ShineTextView p = ta.p;
       if (i < p || p < null) {
          k1.r(ta.r, ta.m);
       }
       return;
    }
}
