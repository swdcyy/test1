package com.yxcorp.gifshow.ad.webview.n$b;
import k59.m1;
import com.yxcorp.gifshow.ad.webview.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import java.lang.System;
import android.view.View;

public class n$b implements m1	// class@00190d
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "2")) {
          return;
       }
       k1.m(this.a.z);
       n$b ta = this.a;
       if (ta.v == null) {
          return;
       }
       ta.t = ta.t - (System.currentTimeMillis() - this.a.u);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "1")) {
          return;
       }
       n$b ta = this.a;
       if (ta.v == null) {
          return;
       }
       ta.Z8();
       n w = this.a.w;
       if (w != null) {
          w.setVisibility(0);
       }
       ta = this.a;
       k1.r(ta.z, ta.t);
       this.a.u = System.currentTimeMillis();
       return;
    }
    public void onClose(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "3")) {
          return;
       }
       k1.m(this.a.z);
       this.a.V8();
       return;
    }
}
