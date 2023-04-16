package com.kwai.plugin.dva.split.SplitManager$mReadSplitConfigFuture$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.FutureTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.split.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import java.lang.Runnable;
import java.util.concurrent.Future;

public final class SplitManager$mReadSplitConfigFuture$2 extends Lambda implements a	// class@001386
{
    public static final SplitManager$mReadSplitConfigFuture$2 INSTANCE;

    static {
       SplitManager$mReadSplitConfigFuture$2.INSTANCE = new SplitManager$mReadSplitConfigFuture$2();
    }
    public void SplitManager$mReadSplitConfigFuture$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final FutureTask invoke(){
       FutureTask obj = PatchProxy.apply(null, this, SplitManager$mReadSplitConfigFuture$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FutureTask(c.b);
       WorkExecutors.a().submit(obj);
       return obj;
    }
}
