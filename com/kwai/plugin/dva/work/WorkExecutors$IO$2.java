package com.kwai.plugin.dva.work.WorkExecutors$IO$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.work.WorkExecutors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import com.kwai.plugin.dva.work.WorkExecutors$IO$2$a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class WorkExecutors$IO$2 extends Lambda implements a	// class@000ecb
{
    public static final WorkExecutors$IO$2 INSTANCE;

    static {
       WorkExecutors$IO$2.INSTANCE = new WorkExecutors$IO$2();
    }
    public void WorkExecutors$IO$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ExecutorService invoke(){
       ExecutorService obj = PatchProxy.apply(null, this, WorkExecutors$IO$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = WorkExecutors.f;
       if (obj == null) {
          ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30, TimeUnit.SECONDS, new SynchronousQueue(), new WorkExecutors$IO$2$a());
       }
       return obj;
    }
}
