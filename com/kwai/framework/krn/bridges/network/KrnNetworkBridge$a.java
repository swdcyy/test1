package com.kwai.framework.krn.bridges.network.KrnNetworkBridge$a;
import y86.d;
import com.kwai.framework.krn.bridges.network.KrnNetworkBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.kwai.framework.krn.init.network.KrnNetResponse;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.krn.init.network.b;
import com.kuaishou.krn.c;
import java.lang.Boolean;
import com.facebook.react.bridge.WritableNativeMap;
import com.kuaishou.krn.base.KrnBridge;
import com.kwai.framework.krn.init.network.KrnNetErrorInfo;
import java.lang.StringBuilder;

public class KrnNetworkBridge$a implements d	// class@0015c5
{
    public final Promise a;
    public final KrnNetworkBridge b;

    public void KrnNetworkBridge$a(KrnNetworkBridge p0,Promise p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(KrnNetResponse p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnNetworkBridge$a.class, "1")) {
          return;
       }
       if (b.b && !c.b().k()) {
          this.a.resolveNew(p0.data, Boolean.valueOf((("string").equalsIgnoreCase(p1) ^ 0x01)));
       }else {
          p0 = p0.data;
          if (p0 instanceof String) {
             this.a.resolve(p0);
          }else {
             this.a.resolve(this.b.convertObjToNativeMap(p0));
          }
       }
       return;
    }
    public void b(KrnNetErrorInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnNetworkBridge$a.class, "2")) {
          return;
       }
       this.a.reject(p0.code, p0.message);
       return;
    }
}
