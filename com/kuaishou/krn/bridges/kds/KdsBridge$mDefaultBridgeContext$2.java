package com.kuaishou.krn.bridges.kds.KdsBridge$mDefaultBridgeContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import wi0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ik0.g;
import com.facebook.react.bridge.ReactContext;

public final class KdsBridge$mDefaultBridgeContext$2 extends Lambda implements a	// class@000819
{
    public final ReactApplicationContext $reactContext;

    public void KdsBridge$mDefaultBridgeContext$2(ReactApplicationContext p0){
       this.$reactContext = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, KdsBridge$mDefaultBridgeContext$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(null, this.$reactContext);
    }
}
