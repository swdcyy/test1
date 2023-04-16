package com.yxcorp.gifshow.tti.module.BinderProxyInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.fluency.ipcproxy.lib.b;

public class BinderProxyInitModule extends TTIInitModule	// class@001db9
{

    public void BinderProxyInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BinderProxyInitModule.class, "1")) {
          return;
       }
       b.a();
       return;
    }
}
