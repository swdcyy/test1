package com.kuaishou.tachikoma.api.container.TKContainer$g;
import tx4.f;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.r;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bx4.h;
import java.lang.Boolean;
import com.kuaishou.tachikoma.api.container.TKContainer$g$a;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

public class TKContainer$g implements f	// class@000f6a
{
    public final boolean[] a;
    public final boolean b;
    public final r c;
    public final String d;
    public final TKContainer e;

    public void TKContainer$g(TKContainer p0,boolean[] p1,boolean p2,r p3,String p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer$g.class, "3")) {
          return;
       }
       p0[0] = true;
       TKContainer$g tc = this.c;
       if (tc != null) {
          tc.a(4000, p1);
       }
       if (!this.e.isDestroyed()) {
          tc = this.e;
          tc.k.j(tc.h, 0, 4000, TKContainer.R(p1), this.d);
       }
       return;
    }
    public void b(boolean p0){
       TKContainer$g og = TKContainer$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "1")) {
          return;
       }
       if (p0) {
          TKContainer p = this.e.P;
          if (p != null) {
             p.postFrameCallback(new TKContainer$g$a(this));
          }
       }
       return;
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$g.class, "2")) {
          return;
       }
       TKContainer$g ta = this.a;
       int i = 0;
       if (!ta[i]) {
          ta[i] = true;
          this.e.N(this.b, this.c, this.d);
       }
       return;
    }
}
