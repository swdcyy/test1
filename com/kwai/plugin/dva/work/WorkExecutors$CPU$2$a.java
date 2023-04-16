package com.kwai.plugin.dva.work.WorkExecutors$CPU$2$a;
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
import java.lang.Integer;
import qj7.d;

public final class WorkExecutors$CPU$2$a implements ThreadFactory	// class@00139a
{
    public final AtomicInteger b;

    public void WorkExecutors$CPU$2$a(){
       super();
       this.b = new AtomicInteger();
    }
    public Thread newThread(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WorkExecutors$CPU$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "r");
       int i = this.b.incrementAndGet();
       d.c(a.C("NEW CPU THREAD ", Integer.valueOf(i)));
       return new Thread(p0, a.C("dva_cpu_", Integer.valueOf(i)));
    }
}
