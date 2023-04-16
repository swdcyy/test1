package com.kuaishou.commercial.home.c$g;
import ub.a;
import com.kuaishou.commercial.home.c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.widget.ImageView;

public class c$g extends a	// class@0014df
{
    public final c b;

    public void c$g(c p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$g.class, "1")) {
       }else {
          c$g tb = this.b;
          tb.z = p2;
          if (tb.N != null && p2 != null) {
             p2.start();
          }
          c$g tb1 = this.b;
          tb.I = System.currentTimeMillis() - tb1.H;
          c l = tb1.L;
          if (l != null && l.isAlive()) {
             tb = this.b;
             tb.L.removeOnScrollChangedListener(tb.R);
          }
          tb = this.b;
          p1 = tb.p;
          if (p1 != null) {
             tb.L = p1.getViewTreeObserver();
          }
          l = this.b.L;
          if (l != null && l.isAlive()) {
             tb = this.b;
             tb.L.addOnScrollChangedListener(tb.R);
          }
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
    }
}
