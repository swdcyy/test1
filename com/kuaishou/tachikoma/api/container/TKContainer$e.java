package com.kuaishou.tachikoma.api.container.TKContainer$e;
import tx4.r;
import com.kuaishou.tachikoma.api.container.TKContainer;
import sx4.e$a;
import tx4.o;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import tx4.w;

public class TKContainer$e implements r	// class@000f67
{
    public final e$a a;
    public final o b;
    public final String c;
    public final String d;
    public final Object[] e;
    public final TKViewContainerWrapView$a f;
    public final TKViewContainerWrapView g;
    public final TKContainer h;

    public void TKContainer$e(TKContainer p0,e$a p1,o p2,String p3,String p4,Object[] p5,TKViewContainerWrapView$a p6,TKViewContainerWrapView p7){
       this.h = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$e uoe = TKContainer$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "2")) {
          return;
       }
       if (!this.h.isDestroyed()) {
          uoe = this.f;
          if (uoe != null) {
             uoe.a(this.g, p0, p1, this.h.b);
          }
          this.g.d(p1, null);
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKContainer$e.class, "1")) {
          return;
       }
       if (!this.h.isDestroyed()) {
          this.h.O(this.a, this.b, this.c, this.d, this.e);
       }
       return;
    }
}
