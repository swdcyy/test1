package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.util.Iterator;
import java.lang.Iterable;
import ac3.l;

public final class LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1 extends Lambda implements l	// class@000a0d
{
    public final LiveBaseLongConnectionManager$connectState$1 this$0;

    public void LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1(LiveBaseLongConnectionManager$connectState$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "e");
       Iterator iterator = this.this$0.h.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       PatchProxy.onMethodExit(LiveBaseLongConnectionManager$connectState$1$createReconnectLogic$$inlined$also$lambda$1.class, "1");
       return;
    }
}
