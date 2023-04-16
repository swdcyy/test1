package com.kuaishou.live.external.p$f;
import qp.a;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g33.p;
import pp.c;
import com.kuaishou.android.live.log.b;

public class p$f implements a	// class@001bb1
{

    public void p$f(){
       super();
    }
    public void a(String p0,String p1,Map p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, p$f.class, "2")) {
          return;
       }
       b.K(new p(p0), p1, p2, p3);
       return;
    }
    public void b(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, p$f.class, "1")) {
          return;
       }
       b.h0(new p(p0), p1, p2);
       return;
    }
}
