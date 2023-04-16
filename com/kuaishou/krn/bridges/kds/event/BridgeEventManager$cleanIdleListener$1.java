package com.kuaishou.krn.bridges.kds.event.BridgeEventManager$cleanIdleListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.krn.bridges.kds.event.BridgeEventManager$a;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.CatalystInstance;

public final class BridgeEventManager$cleanIdleListener$1 extends Lambda implements l	// class@000821
{
    public static final BridgeEventManager$cleanIdleListener$1 INSTANCE;

    static {
       BridgeEventManager$cleanIdleListener$1.INSTANCE = new BridgeEventManager$cleanIdleListener$1();
    }
    public void BridgeEventManager$cleanIdleListener$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(BridgeEventManager$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BridgeEventManager$cleanIdleListener$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       CatalystInstance uCatalystIns = p0.a();
       boolean b = (uCatalystIns != null)? uCatalystIns.isDestroyed(): true;
       return b;
    }
}
