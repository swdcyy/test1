package com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioExecutorService$2;
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
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioExecutorService$2$a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class Schedulers$ioExecutorService$2 extends Lambda implements a	// class@001489
{
    public static final Schedulers$ioExecutorService$2 INSTANCE;

    static {
       Schedulers$ioExecutorService$2.INSTANCE = new Schedulers$ioExecutorService$2();
    }
    public void Schedulers$ioExecutorService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ThreadPoolExecutor invoke(){
       Object obj = PatchProxy.apply(null, this, Schedulers$ioExecutorService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30, TimeUnit.SECONDS, new SynchronousQueue(), new Schedulers$ioExecutorService$2$a());
       return obj;
    }
}
