package com.kuaishou.tachikoma.api.container.TKContainer$b;
import tx4.r;
import com.kuaishou.tachikoma.api.container.TKContainer;
import sx4.e$a;
import tx4.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import tx4.w;

public class TKContainer$b implements r	// class@000f64
{
    public final e$a a;
    public final o b;
    public final String c;
    public final String d;
    public final Object[] e;
    public final o f;
    public final TKContainer g;

    public void TKContainer$b(TKContainer p0,e$a p1,o p2,String p3,String p4,Object[] p5,o p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$b uob = TKContainer$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       if (!this.g.isDestroyed()) {
          uob = this.f;
          if (uob != null) {
             uob.b(p0, p1, this.g.b);
          }
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKContainer$b.class, "1")) {
          return;
       }
       if (!this.g.isDestroyed()) {
          this.g.O(this.a, this.b, this.c, this.d, this.e);
       }
       return;
    }
}
