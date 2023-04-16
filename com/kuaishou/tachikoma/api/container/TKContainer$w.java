package com.kuaishou.tachikoma.api.container.TKContainer$w;
import tx4.c;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.r;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import tx4.b;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import zp8.a;
import bx4.h;

public class TKContainer$w implements c	// class@000f7a
{
    public final boolean a;
    public final r b;
    public final String c;
    public final TKContainer d;

    public void TKContainer$w(TKContainer p0,boolean p1,r p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(w p0){
       b.b(this, p0);
    }
    public void b(int p0,Throwable p1){
       TKContainer$w ow = TKContainer$w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ow, "2")) {
          return;
       }
       ow = this.b;
       if (ow != null) {
          ow.a(p0, p1);
       }
       a.i("TKContainer", "async load bundle fail, error code is "+p0+", error msg is "+TKContainer.R(p1));
       ow = this.d;
       TKContainer k = ow.k;
       if (k != null) {
          k.j(ow.h, 0, p0, TKContainer.R(p1), this.c);
       }
       return;
    }
    public void onBundleLoadFinish(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$w.class, "1")) {
          return;
       }
       this.d.M(this.a, this.b, this.c);
       return;
    }
}
