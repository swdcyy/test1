package com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$notifyRequestSuccess$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import java.lang.Object;
import jg5.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RealtimeStartupManagerImpl$notifyRequestSuccess$1 extends Lambda implements l	// class@000b0e
{
    public final RealtimeStartupResponse $response;

    public void RealtimeStartupManagerImpl$notifyRequestSuccess$1(RealtimeStartupResponse p0){
       this.$response = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeStartupManagerImpl$notifyRequestSuccess$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.m(this.$response);
       return;
    }
}
