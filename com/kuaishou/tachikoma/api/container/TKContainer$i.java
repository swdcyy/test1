package com.kuaishou.tachikoma.api.container.TKContainer$i;
import ww4.b;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Integer;

public class TKContainer$i implements b	// class@000f6c
{
    public final n a;
    public final boolean b;
    public final TKContainer c;

    public void TKContainer$i(TKContainer p0,n p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TKContainer$i.class, "2")) {
          return;
       }
       this.c.G(this.a, this.b);
       return;
    }
    public void b(int p0,Throwable p1){
       TKContainer$i oi = TKContainer$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "1")) {
          return;
       }
       this.c.Y(this.a, p0, p1, this.b);
       return;
    }
}
