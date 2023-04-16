package com.kuaishou.krn.bridges.kds.KdsBridge$a;
import java.lang.Object;
import nsd.u;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeArray;

public final class KdsBridge$a	// class@000813
{

    public void KdsBridge$a(){
       super();
    }
    public void KdsBridge$a(u p0){
       super();
    }
    public final void a(CatalystInstance p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KdsBridge$a.class, "1")) {
          return;
       }
       a.p(p1, "callbackId");
       if (p0 != null) {
          Object[] objArray = new Object[]{p1,p2};
          p0.callFunction("KdsCallback", "callback", Arguments.fromJavaArgs(objArray));
       }
       return;
    }
}
