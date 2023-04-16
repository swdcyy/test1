package com.kwai.performance.fluency.startup.scheduler.executor.RealTimeThreadExecutor$mExecutor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import kf7.a;
import java.util.concurrent.Executors;

public final class RealTimeThreadExecutor$mExecutor$2 extends Lambda implements a	// class@0010e6
{
    public static final RealTimeThreadExecutor$mExecutor$2 INSTANCE;

    static {
       RealTimeThreadExecutor$mExecutor$2.INSTANCE = new RealTimeThreadExecutor$mExecutor$2();
    }
    public void RealTimeThreadExecutor$mExecutor$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ExecutorService invoke(){
       ExecutorService c = a.c;
       if (c != null) {
       }else {
          c = Executors.newCachedThreadPool();
       }
       return c;
    }
}
