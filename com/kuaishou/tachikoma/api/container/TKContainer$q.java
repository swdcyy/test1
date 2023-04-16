package com.kuaishou.tachikoma.api.container.TKContainer$q;
import tx4.f;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bx4.h;
import tx4.e;

public class TKContainer$q implements f	// class@000f74
{
    public final TKContainer a;

    public void TKContainer$q(TKContainer p0){
       this.a = p0;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer$q.class, "2")) {
          return;
       }
       TKContainer k = this.a.k;
       if (k != null) {
          k.g();
       }
       return;
    }
    public void b(boolean p0){
       e.a(this, p0);
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer$q.class, "1")) {
          return;
       }
       TKContainer k = this.a.k;
       if (k != null) {
          k.h();
       }
       return;
    }
}
