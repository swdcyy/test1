package f97.a;
import java.lang.Object;
import ub7.f;
import java.util.concurrent.ExecutorService;
import java.lang.Runtime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import f97.c;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.SynchronousQueue;
import f97.a$a;
import java.lang.Runnable;
import am8.a;
import am8.d;
import f97.a$b;
import java.util.concurrent.Future;
import java.util.concurrent.AbstractExecutorService;

public class a	// class@0015eb
{
    public final ExecutorService a;
    public final ThreadPoolExecutor b;
    public static f c;
    public static f d;
    public static boolean e;

    public void a(){
       super();
       f c = a.c;
       ThreadPoolExecutor threadPoolEx = null;
       ExecutorService uExecutorSer = (c != null)? c.get(): threadPoolEx;
       if (uExecutorSer != null) {
          this.a = uExecutorSer;
       }else {
          int i = Runtime.getRuntime().availableProcessors() * 2;
          ThreadPoolExecutor threadPoolEx2 = new ThreadPoolExecutor(i, i, (long)3, TimeUnit.MINUTES, new LinkedBlockingQueue(), new c("azeroth-default-global-pool"));
          this.a = v11;
          v11.allowCoreThreadTimeOut(true);
       }
       c = a.d;
       if (c != null) {
          threadPoolEx = c.get();
       }
       if (threadPoolEx != null) {
          this.b = threadPoolEx;
       }else {
          ThreadPoolExecutor threadPoolEx1 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new c("azeroth-cached-global-pool"));
          this.b = c;
       }
       return;
    }
    public void a(a$a p0){
       super();
       f c = a.c;
       ThreadPoolExecutor threadPoolEx = null;
       ExecutorService uExecutorSer = (c != null)? c.get(): threadPoolEx;
       if (uExecutorSer != null) {
          this.a = uExecutorSer;
       }else {
          int i = Runtime.getRuntime().availableProcessors() * 2;
          ThreadPoolExecutor threadPoolEx2 = new ThreadPoolExecutor(i, i, (long)3, TimeUnit.MINUTES, new LinkedBlockingQueue(), new c("azeroth-default-global-pool"));
          this.a = v10;
          v10.allowCoreThreadTimeOut(true);
       }
       c = a.d;
       if (c != null) {
          threadPoolEx = c.get();
       }
       if (threadPoolEx != null) {
          this.b = threadPoolEx;
       }else {
          ThreadPoolExecutor threadPoolEx1 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new c("azeroth-cached-global-pool"));
          this.b = c.get();
       }
       return;
    }
    public static void a(Runnable p0){
       if (a.e) {
          d.b("azeroth-elastic", 1).execute(p0);
       }else {
          a.b().a.execute(p0);
       }
       return;
    }
    public static a b(){
       return a$b.a;
    }
    public static ExecutorService c(){
       return a.b().a;
    }
    public static ThreadPoolExecutor d(String p0,int p1){
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p1, p1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new c(p0));
       v8.allowCoreThreadTimeOut(true);
       return v8;
    }
    public static ThreadPoolExecutor e(String p0){
       return a.d(p0, 1);
    }
    public static Future f(Runnable p0){
       if (a.e) {
          return d.b("azeroth-elastic", 1).submit(p0);
       }
       return a.b().a.submit(p0);
    }
}
