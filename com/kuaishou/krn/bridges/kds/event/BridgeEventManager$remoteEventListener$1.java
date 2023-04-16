package com.kuaishou.krn.bridges.kds.event.BridgeEventManager$remoteEventListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.bridges.kds.bridges.beans.EventParams;
import java.lang.Object;
import com.kuaishou.krn.bridges.kds.event.BridgeEventManager$a;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class BridgeEventManager$remoteEventListener$1 extends Lambda implements l	// class@000822
{
    public final CatalystInstance $catalystInstance;
    public final EventParams $params;

    public void BridgeEventManager$remoteEventListener$1(CatalystInstance p0,EventParams p1){
       this.$catalystInstance = p0;
       this.$params = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(BridgeEventManager$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BridgeEventManager$remoteEventListener$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (a.g(p0.a(), this.$catalystInstance) && (a.g(p0.c(), this.$params.getType()) && a.g(p0.b(), this.$params.getListener())))? true: false;
       return b;
    }
}
