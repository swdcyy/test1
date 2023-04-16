package com.kuaishou.live.playeradapter.dns.RavenInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.playeradapter.dns.a;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class RavenInitModule extends TTIInitModule	// class@000d47
{
    public static final int q;

    public void RavenInitModule(){
       super();
    }
    public int f0(){
       return 3;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RavenInitModule.class, "1")) {
          return;
       }
       e.h(a.b, "RavenInitModule", true);
       return;
    }
}
