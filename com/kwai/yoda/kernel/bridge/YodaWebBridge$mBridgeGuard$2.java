package com.kwai.yoda.kernel.bridge.YodaWebBridge$mBridgeGuard$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import java.lang.Object;
import ny7.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaWebBridge$mBridgeGuard$2 extends Lambda implements a	// class@001289
{
    public final YodaWebBridge this$0;

    public void YodaWebBridge$mBridgeGuard$2(YodaWebBridge p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       Object obj = PatchProxy.apply(null, this, YodaWebBridge$mBridgeGuard$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.f();
    }
}
