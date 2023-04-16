package com.kwai.framework.krn.bridges.network.KrnNetworkBridge$b;
import y86.d;
import com.kwai.framework.krn.bridges.network.KrnNetworkBridge;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.kwai.framework.krn.init.network.KrnNetResponse;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import java.util.Map;
import com.google.gson.Gson;
import com.kuaishou.krn.base.KrnBridge;
import com.kwai.framework.krn.init.network.KrnNetErrorInfo;

public class KrnNetworkBridge$b implements d	// class@0015c6
{
    public final Callback a;
    public final Callback b;
    public final KrnNetworkBridge c;

    public void KrnNetworkBridge$b(KrnNetworkBridge p0,Callback p1,Callback p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(KrnNetResponse p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnNetworkBridge$b.class, "1")) {
          return;
       }
       if (p0.data instanceof String && !("string").equalsIgnoreCase(p1)) {
          p0.data = a.a.h(p0.data, Map.class);
       }
       Object[] objArray = new Object[]{this.c.convertBeanToJson(p0)};
       this.a.invoke(objArray);
       return;
    }
    public void b(KrnNetErrorInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnNetworkBridge$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{this.c.convertBeanToJson(p0)};
       this.b.invoke(objArray);
       return;
    }
}
