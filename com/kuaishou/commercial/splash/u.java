package com.kuaishou.commercial.splash.u;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import yy.p1;
import ekd.k1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class u implements Runnable	// class@001627
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       v ov = v.class;
       tb.t = false;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, ov, "11")) {
       }else {
          v u = tb.u;
          if (u != null && u.getVisibility()) {
             tb.u.setAlpha(0);
             tb.u.setVisibility(false);
             ObjectAnimator.ofFloat(tb.u, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(500).start();
          }
          p1 op1 = new p1(tb);
          tb.w = op1;
          k1.r(op1, 300);
       }
       if (!PatchProxy.applyVoid(objArray, tb, ov, "13")) {
          tb.r.d(true, 7);
       }
       v q = tb.q;
       if (q != null) {
          q.setVisibility(false);
       }
       return;
    }
}
