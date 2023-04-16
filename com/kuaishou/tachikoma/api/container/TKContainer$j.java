package com.kuaishou.tachikoma.api.container.TKContainer$j;
import fx4.b;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.n;
import java.lang.Object;
import tw4.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;
import tw4.b0;
import java.lang.Runnable;
import iq8.x;
import vw4.l;
import dx4.a;
import bx4.h;
import tw4.a;
import java.lang.Boolean;
import qp8.d;
import fx4.a;
import java.lang.Throwable;

public class TKContainer$j implements b	// class@000f6d
{
    public final n a;
    public final boolean b;
    public final TKContainer c;

    public void TKContainer$j(TKContainer p0,n p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(t p0){
       TKContainer$j ta;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$j.class, "1")) {
          return;
       }
       if (this.c.isDestroyed()) {
          return;
       }
       a.i("TKContainer", "asyncInit, onFinished: "+this.c.h);
       if (this.c.c != null) {
          ta = this.a;
          if (ta != null && this.b == null) {
             ta.a();
          }
          if (p0 != null) {
             x.f(new b0(p0));
          }
          return;
       }else if(p0 == null){
          x.f(new l(this, this.a, this.b));
       }else {
          this.c.f0(p0);
          this.c.c = p0;
          TKContainer$j tc = this.c;
          tc.x = tc.c.hashCode();
          ta = this.c;
          boolean b = true;
          a.e().f(ta.x, ta.h, b);
          TKContainer k = this.c.k;
          if (k != null) {
             k.c();
             tc = this.c;
             tc.k.t(tc.c.f());
             this.c.k.k(b);
             this.c.k.p(h.B);
          }
          if (h.B) {
             h.B = false;
          }
          if (a.c.booleanValue()) {
             ta = this.c;
             d.p().l(ta.h, ta.y, "asyncInitContext");
          }
          tc = this.a;
          if (tc != null) {
             tc.a();
          }
       }
       return;
    }
    public void b(){
       a.a(this);
    }
    public void onError(Throwable p0){
       a.b(this, p0);
    }
    public void onStart(){
       a.d(this);
    }
}
