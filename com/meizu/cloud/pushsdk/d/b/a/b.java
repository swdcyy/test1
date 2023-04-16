package com.meizu.cloud.pushsdk.d.b.a.b;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.lang.Runnable;

public class b	// class@00150a
{
    public static ExecutorService a;
    public static int b;

    public void b(){
       super();
    }
    public static ExecutorService a(){
       b uob = b.class;
       _monitor_enter(uob);
       if (b.a == null) {
          b.a = Executors.newScheduledThreadPool(b.b);
       }
       _monitor_exit(uob);
       return b.a;
    }
    public static Future a(Callable p0){
       return b.a().submit(p0);
    }
    public static void a(int p0){
       b.b = p0;
    }
    public static void a(Runnable p0){
       b.a().execute(p0);
    }
}
