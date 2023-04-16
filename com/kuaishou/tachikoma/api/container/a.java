package com.kuaishou.tachikoma.api.container.a;
import tx4.c;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tw4.t;
import java.lang.Throwable;
import tx4.r;
import java.lang.Object;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vw4.o;
import java.lang.Runnable;
import iq8.x;
import java.lang.Integer;
import tx4.b;

public class a implements c	// class@000f7c
{
    public final t a;
    public final Throwable[] b;
    public final r c;
    public final TKContainer d;

    public void a(TKContainer p0,t p1,Throwable[] p2,r p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.d.isDestroyed()) {
          return;
       }
       o oo = new o(this, this.a, p0, this.b, this.c);
       x.b(v0);
       return;
    }
    public void b(int p0,Throwable p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       if (this.d.isDestroyed()) {
          return;
       }
       uoa = this.b;
       uoa[0] = p1;
       this.d.Z(uoa[0], p0, this.c);
       return;
    }
    public void onBundleLoadFinish(w p0){
       b.a(this, p0);
    }
}
