package com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestPrepareEnd$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jg5.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RealtimeTabRequester$onRequestPrepareEnd$1 extends Lambda implements l	// class@000b1a
{
    public final boolean $needRequest;

    public void RealtimeTabRequester$onRequestPrepareEnd$1(boolean p0){
       this.$needRequest = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester$onRequestPrepareEnd$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.g(this.$needRequest);
       return;
    }
}
