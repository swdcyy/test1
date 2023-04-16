package com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioSingleThreadService$2$a;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class Schedulers$ioSingleThreadService$2$a implements ThreadFactory	// class@00148a
{
    public final AtomicInteger b;

    public void Schedulers$ioSingleThreadService$2$a(){
       super();
       this.b = new AtomicInteger();
    }
    public Thread newThread(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$ioSingleThreadService$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "r");
       return new Thread(p0, "eve_io_single_thread_"+this.b.incrementAndGet());
    }
}
