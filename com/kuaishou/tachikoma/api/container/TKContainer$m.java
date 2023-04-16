package com.kuaishou.tachikoma.api.container.TKContainer$m;
import tx4.c;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Integer;
import vw4.n;
import java.lang.Runnable;
import iq8.x;
import java.lang.StringBuilder;
import zp8.a;
import bx4.h;

public class TKContainer$m implements c	// class@000f70
{
    public final c a;
    public final boolean b;
    public final TKContainer c;

    public void TKContainer$m(TKContainer p0,c p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$m.class, "2")) {
          return;
       }
       if (this.c.isDestroyed()) {
          return;
       }
       TKContainer$m ta = this.a;
       if (ta != null) {
          ta.a(p0);
       }
       return;
    }
    public void b(int p0,Throwable p1){
       TKContainer$m om = TKContainer$m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "3")) {
          return;
       }
       if (this.c.isDestroyed()) {
          return;
       }
       x.b(new n(this.a, p0, p1));
       return;
    }
    public void onBundleLoadFinish(w p0){
       TKContainer$m tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$m.class, "1")) {
          return;
       }
       if (this.c.isDestroyed()) {
          return;
       }
       a.i("TKContainer", "asyncLoadBundlerInner, onBundleLoadFinish: "+this.c.h);
       if (this.c.b != null) {
          TKContainer$m ta = this.a;
          if (ta != null && this.b == null) {
             ta.onBundleLoadFinish(this.c.b);
          }
          return;
       }else if(p0 == null){
          this.b(3016, new Throwable("bundleInfo invalid"));
          return;
       }else {
          this.c.b = p0;
          TKContainer k = this.c.k;
          if (k != null) {
             k.d();
             tc = this.c;
             tc.k.l(tc.b);
          }
          tc = this.a;
          if (tc != null) {
             tc.onBundleLoadFinish(p0);
          }
          return;
       }
    }
}
