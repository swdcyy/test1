package com.yxcorp.gifshow.init.module.PltHackInitModule$1;
import com.kwai.performance.stability.hack.b$c;
import com.yxcorp.gifshow.init.module.PltHackInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pxa.e;
import q87.c;
import k2b.u1;

public class PltHackInitModule$1 implements b$c	// class@001993
{
    public final PltHackInitModule a;

    public void PltHackInitModule$1(PltHackInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PltHackInitModule$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().t("PltHackInitModule", p1.toString(), objArray);
       PatchProxy.onMethodExit(PltHackInitModule$1.class, "2");
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PltHackInitModule$1.class, "1")) {
          return;
       }
       u1.Q(p0, p1);
       PatchProxy.onMethodExit(PltHackInitModule$1.class, "1");
       return;
    }
}
