package com.kuaishou.tachikoma.api.container.TKContainer$p;
import tx4.c;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import tx4.w;
import tx4.b;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import bx4.h;

public class TKContainer$p implements c	// class@000f73
{
    public final boolean a;
    public final TKContainer b;

    public void TKContainer$p(TKContainer p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(w p0){
       b.b(this, p0);
    }
    public void b(int p0,Throwable p1){
       TKContainer$p op = TKContainer$p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, op, "2")) {
          return;
       }
       TKContainer k = this.b.k;
       if (k != null) {
          k.g();
       }
       this.b.F = false;
       if (this.b.D != null) {
          this.b.D.b(p0, p1);
          p0.D = null;
       }
       return;
    }
    public void onBundleLoadFinish(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$p.class, "1")) {
          return;
       }
       if (this.b.isDestroyed()) {
          return;
       }
       this.b.F = false;
       if (this.b.D != null) {
          this.b.D.onBundleLoadFinish(p0);
          p0.D = null;
          if (this.b.c != null) {
             TKContainer k = this.b.k;
             if (k != null) {
                k.h();
             }
          }
       }else {
          this.b.a0(this.a);
       }
       return;
    }
}
