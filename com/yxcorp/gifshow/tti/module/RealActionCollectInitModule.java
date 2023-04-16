package com.yxcorp.gifshow.tti.module.RealActionCollectInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.tti.module.g;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class RealActionCollectInitModule extends TTIInitModule	// class@001dc3
{
    public static final int q;

    public void RealActionCollectInitModule(){
       super();
    }
    public int f0(){
       return 13;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealActionCollectInitModule.class, "1")) {
          return;
       }
       e.j(g.b, "RealActionCollectInitModule", true);
       return;
    }
}
