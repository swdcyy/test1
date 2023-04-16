package com.kuaishou.tachikoma.api.container.TKContainer$u;
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

public class TKContainer$u implements r	// class@000f78
{
    public final e$a a;
    public final o b;
    public final String c;
    public final String d;
    public final Object[] e;
    public final o f;
    public final TKContainer g;

    public void TKContainer$u(TKContainer p0,e$a p1,o p2,String p3,String p4,Object[] p5,o p6){
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
       TKContainer$u ou = TKContainer$u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ou, "2")) {
          return;
       }
       ou = this.f;
       if (ou != null) {
          ou.b(p0, p1, this.g.b);
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKContainer$u.class, "1")) {
          return;
       }
       this.g.O(this.a, this.b, this.c, this.d, this.e);
       return;
    }
}
