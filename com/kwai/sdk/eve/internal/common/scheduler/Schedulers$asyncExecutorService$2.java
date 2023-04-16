package com.kwai.sdk.eve.internal.common.scheduler.Schedulers$asyncExecutorService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import f97.c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class Schedulers$asyncExecutorService$2 extends Lambda implements a	// class@001486
{
    public static final Schedulers$asyncExecutorService$2 INSTANCE;

    static {
       Schedulers$asyncExecutorService$2.INSTANCE = new Schedulers$asyncExecutorService$2();
    }
    public void Schedulers$asyncExecutorService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ThreadPoolExecutor invoke(){
       Object obj = PatchProxy.apply(null, this, Schedulers$asyncExecutorService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new c("eve_async_pool"));
       return obj;
    }
}
