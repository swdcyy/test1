package com.tencent.open.utils.j;
import java.lang.Object;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Looper;
import java.lang.Runnable;
import com.tencent.open.utils.j$a;
import com.tencent.open.utils.j$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class j	// class@000f83
{
    public static final Executor a;
    public static Object b;
    public static Handler c;
    public static HandlerThread d;

    static {
       j.b = new Object();
       j.a = j.c();
    }
    public void j(){
       super();
    }
    public static Handler a(){
       if (j.c == null) {
          j oj = j.class;
          _monitor_enter(oj);
          HandlerThread handlerThrea = new HandlerThread("SDK_SUB");
          j.d = handlerThrea;
          handlerThrea.start();
          j.c = new Handler(j.d.getLooper());
          _monitor_exit(oj);
       }
       return j.c;
    }
    public static void a(Runnable p0){
       try{
          j.a.execute(p0);
          return;
       }catch(java.util.concurrent.RejectedExecutionException e0){
       }
    }
    public static Executor b(){
       return new j$a(null);
    }
    public static void b(Runnable p0){
       j.a().post(p0);
    }
    public static Executor c(){
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
       return v7;
    }
}
