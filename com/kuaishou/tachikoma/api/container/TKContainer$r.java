package com.kuaishou.tachikoma.api.container.TKContainer$r;
import tx4.n;
import com.kuaishou.tachikoma.api.container.TKContainer;
import tx4.r;
import java.lang.Object;
import tx4.m;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class TKContainer$r implements n	// class@000f75
{
    public final r a;
    public final TKContainer b;

    public void TKContainer$r(TKContainer p0,r p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       m.a(this);
    }
    public void b(int p0,Throwable p1){
       TKContainer$r or = TKContainer$r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, or, "1")) {
          return;
       }
       or = this.a;
       if (or != null) {
          or.a(p0, p1);
       }
       return;
    }
    public void onInitSuccess(){
    }
}
