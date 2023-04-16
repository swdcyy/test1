package com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioSingleThreadService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioSingleThreadService$2$a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class Schedulers$ioSingleThreadService$2 extends Lambda implements a	// class@00148b
{
    public static final Schedulers$ioSingleThreadService$2 INSTANCE;

    static {
       Schedulers$ioSingleThreadService$2.INSTANCE = new Schedulers$ioSingleThreadService$2();
    }
    public void Schedulers$ioSingleThreadService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ThreadPoolExecutor invoke(){
       Object obj = PatchProxy.apply(null, this, Schedulers$ioSingleThreadService$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Schedulers$ioSingleThreadService$2$a());
       return obj;
    }
}
