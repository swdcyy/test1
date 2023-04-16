package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$ConnectionInterrupted;
import ut7.e;
import com.kwai.statechart.a;

public final class LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2 extends Lambda implements l	// class@000a0e
{
    public final LiveBaseLongConnectionManager$connectState$1 this$0;

    public void LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2(LiveBaseLongConnectionManager$connectState$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport2(LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2.class, "1")) {
          return;
       }
       this.this$0.g(new LiveBaseLongConnectionManager$ConnectionInterrupted(p0));
       PatchProxy.onMethodExit(LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$2.class, "1");
       return;
    }
}
