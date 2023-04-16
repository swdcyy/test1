package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer;
import ftd.k0;
import ka1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ja1.e;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import ftd.j2;
import ftd.z0;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer extends a implements k0	// class@000ed5
{

    public void LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer(a p0){
       a.p(p0, "upstreamConsumer");
       super(p0);
    }
    public void b(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer.class, "4")) {
          return;
       }
       a.p(p0, "throwable");
       a.p(p1, "failedReason");
       a uoa = this.a();
       if (uoa != null) {
          uoa.b(p0, p1);
       }
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a.f(this, null, null, new LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$onNewResult$1(this, p0, null), 3, null);
       return;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.g().plus(new LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$a(CoroutineExceptionHandler.u0));
    }
}
