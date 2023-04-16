package com.kuaishou.tachikoma.api.container.TKContainer$v;
import tx4.n;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.r;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Integer;

public class TKContainer$v implements n	// class@000f79
{
    public final boolean a;
    public final r b;
    public final String c;
    public final TKContainer d;

    public void TKContainer$v(TKContainer p0,boolean p1,r p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TKContainer$v.class, "1")) {
          return;
       }
       this.d.M(this.a, this.b, this.c);
       return;
    }
    public void b(int p0,Throwable p1){
       TKContainer$v ov = TKContainer$v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ov, "2")) {
          return;
       }
       ov = this.b;
       if (ov != null) {
          ov.a(p0, p1);
       }
       return;
    }
    public void onInitSuccess(){
    }
}
