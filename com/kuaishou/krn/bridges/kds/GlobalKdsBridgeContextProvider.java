package com.kuaishou.krn.bridges.kds.GlobalKdsBridgeContextProvider;
import com.kuaishou.krn.bridges.kds.GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import wi0.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wi0.d;

public final class GlobalKdsBridgeContextProvider	// class@000812
{
    public static final p a;
    public static final GlobalKdsBridgeContextProvider b;

    static {
       GlobalKdsBridgeContextProvider.b = new GlobalKdsBridgeContextProvider();
       GlobalKdsBridgeContextProvider.a = s.c(GlobalKdsBridgeContextProvider$mDefaultGlobalKdsBridgeContext$2.INSTANCE);
    }
    public void GlobalKdsBridgeContextProvider(){
       super();
    }
    public final e a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GlobalKdsBridgeContextProvider globalKdsBri = GlobalKdsBridgeContextProvider.class;
       Object obj = PatchProxy.apply(null, this, globalKdsBri, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, globalKdsBri, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = GlobalKdsBridgeContextProvider.a.getValue();
       }
       return obj1;
    }
}
