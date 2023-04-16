package com.yxcorp.gifshow.init.module.BinderProxyInitModule;
import com.kwai.framework.init.a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import com.kwai.performance.fluency.ipcproxy.lib.a;
import java.lang.Runnable;
import ekd.s1;

public class BinderProxyInitModule extends a	// class@0011ca
{

    public void BinderProxyInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BinderProxyInitModule.class, "2")) {
          return;
       }
       b.a();
       PatchProxy.onMethodExit(BinderProxyInitModule.class, "2");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, BinderProxyInitModule.class, "1")) {
          return;
       }
       s1.e(a.b, 0x3a98);
       PatchProxy.onMethodExit(BinderProxyInitModule.class, "1");
       return;
    }
}
