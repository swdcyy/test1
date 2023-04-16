package com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestFailed$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Throwable;
import java.lang.Object;
import jg5.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RealtimeTabRequester$onRequestFailed$2 extends Lambda implements l	// class@000b19
{
    public final boolean $isTimeoutTemp;
    public final Throwable $throwable;
    public final long $timeout;

    public void RealtimeTabRequester$onRequestFailed$2(boolean p0,long p1,Throwable p2){
       this.$isTimeoutTemp = p0;
       this.$timeout = p1;
       this.$throwable = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$onRequestFailed$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (this.$isTimeoutTemp != null) {
          p0.f(this.$timeout);
       }else {
          p0.b(this.$throwable);
       }
       return;
    }
}
