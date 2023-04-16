package com.yxcorp.gifshow.init.module.TMFInitModule;
import com.kwai.framework.init.a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.init.module.TMFInitModule$1;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.yxcorp.gifshow.init.module.TMFInitModule$2;
import com.kwai.plugin.dva.install.a;

public class TMFInitModule extends a	// class@0019a5
{

    public void TMFInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TMFInitModule.class, "1")) {
          return;
       }
       e.g(new TMFInitModule$1(this), "TMFInitModule");
       PatchProxy.onMethodExit(TMFInitModule.class, "1");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, TMFInitModule.class, "2")) {
          return;
       }
       Dva.instance().getPluginInstallManager().o(new TMFInitModule$2(this));
       PatchProxy.onMethodExit(TMFInitModule.class, "2");
       return;
    }
}
