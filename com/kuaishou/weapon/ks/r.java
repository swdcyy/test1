package com.kuaishou.weapon.ks.r;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.kuaishou.weapon.ks.r$1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import com.kuaishou.weapon.ks.r$2;
import java.lang.Runnable;

public class r	// class@00121f
{
    public static r a;
    public static int b;
    public static int c;
    public static ThreadPoolExecutor d;

    public void r(){
       super();
    }
    public static r a(){
       if (r.a == null) {
          r or = r.class;
          _monitor_enter(or);
          if (r.a == null) {
             r.a = new r();
          }
          if (r.d == null) {
             ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(r.b, r.c, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(50), new r$1());
             r.d = v1;
             v1.allowCoreThreadTimeOut(true);
          }
          _monitor_exit(or);
       }
       return r.a;
    }
    public static r a(int p0,int p1){
       if (r.a == null) {
          _monitor_enter(r.class);
          if (r.a == null) {
             r.b = p0;
             r.c = p1;
             r.a = new r();
             if (r.d == null) {
                ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(r.b, r.c, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(50), new r$2());
                r.d = r.d;
                r.d.allowCoreThreadTimeOut(true);
             }
          }
          _monitor_exit(r.class);
       }
       return r.a;
    }
    public void a(Runnable p0){
       try{
          if (p0 != null) {
             r.d.execute(p0);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public ThreadPoolExecutor b(){
       return r.d;
    }
}
