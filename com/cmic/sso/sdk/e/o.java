package com.cmic.sso.sdk.e.o;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import com.cmic.sso.sdk.e.o$a;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import java.lang.Throwable;

public class o	// class@000f6c
{
    public static final ExecutorService a;

    static {
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, 30, 60, TimeUnit.SECONDS, new SynchronousQueue());
       o.a = v7;
    }
    public static void a(o$a p0){
       try{
          o.a.execute(p0);
       }catch(java.lang.Exception e0){
          o$a.a(p0).uncaughtException(Thread.currentThread(), e0);
       }
       return;
    }
}
