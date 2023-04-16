package com.kuaishou.live.rerank.f$c;
import qvb.q;
import com.kuaishou.live.rerank.f;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import bp3.j;
import java.lang.Runnable;
import ekd.k1;

public class f$c implements q	// class@000f6a
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return false;
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(f$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, f$c.class, "1")) {
          return;
       }
       k1.p(new j(this, p0), this.b);
       return;
    }
}
