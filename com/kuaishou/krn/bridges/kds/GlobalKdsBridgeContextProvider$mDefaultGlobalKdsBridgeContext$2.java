package com.kuaishou.krn.bridges.kds.GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import wi0.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import kj0.f;
import java.util.Map;
import wi0.e;
import wi0.c;

public final class GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2 extends Lambda implements a	// class@000811
{
    public static final GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2 INSTANCE;

    static {
       GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2.INSTANCE = new GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2();
    }
    public void GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       return new d(uoc.f().g.get("KDS_BRIDGE_CONTEXT"), new c());
    }
}
