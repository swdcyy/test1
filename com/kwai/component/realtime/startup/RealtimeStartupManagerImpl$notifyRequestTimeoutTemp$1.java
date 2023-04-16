package com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$notifyRequestTimeoutTemp$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jg5.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RealtimeStartupManagerImpl$notifyRequestTimeoutTemp$1 extends Lambda implements l	// class@000b0f
{
    public final long $timeout;

    public void RealtimeStartupManagerImpl$notifyRequestTimeoutTemp$1(long p0){
       this.$timeout = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeStartupManagerImpl$notifyRequestTimeoutTemp$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.n(this.$timeout);
       return;
    }
}
