package t45.c;
import java.lang.Runtime;
import java.lang.Math;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import com.yxcorp.utility.SystemUtil;
import android.content.Context;
import com.yxcorp.utility.SystemUtil$LEVEL;
import t45.e;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.util.concurrent.SynchronousQueue;
import t45.c$a;
import java.lang.Runnable;
import t45.c$b;
import am8.a;
import am8.d;
import am8.e;
import am8.f;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import t45.d;
import brd.t;
import t45.a;
import java.util.concurrent.RunnableFuture;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.util.concurrent.Callable;
import io.reactivex.android.schedulers.a;
import java.lang.StringBuilder;

public class c	// class@002466
{
    public SystemUtil$LEVEL a;
    public e b;
    public final e c;
    public final z d;
    public f e;
    public final BlockingQueue f;
    public final Executor g;
    public t h;
    public static boolean i = true;
    public static boolean j;
    public static Context k;
    public static boolean l;
    public static final int m;
    public static final int n;
    public static final int o;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       c.m = i;
       c.n = Math.max(2, Math.min((i - 1), 4));
       c.o = (i * 2) + 1;
    }
    public void c(){
       e uoe;
       super();
       this.a = null;
       this.f = new LinkedBlockingQueue();
       this.g = Executors.newSingleThreadExecutor(new b("async-log"));
       TimeUnit mINUTES = TimeUnit.MINUTES;
       Context k = c.k;
       if (k != null) {
          SystemUtil$LEVEL w = SystemUtil.w;
          if (w == null) {
             long l = SystemUtil.C(k);
             int i = Runtime.getRuntime().availableProcessors();
             if (l - 0x100000000 >= 0) {
                SystemUtil.w = SystemUtil$LEVEL.BEST;
             }else if(l - 0xc0000000 >= 0){
                SystemUtil.w = SystemUtil$LEVEL.HIGH;
             }else {
                LinkedBlockingQueue linkedBlocki = 4;
                if (l - 0x80000000 >= 0) {
                   if (i >= linkedBlocki) {
                      SystemUtil.w = SystemUtil$LEVEL.HIGH;
                   }else if(i >= 2){
                      SystemUtil.w = SystemUtil$LEVEL.MIDDLE;
                   }else if(i > 0){
                      SystemUtil.w = SystemUtil$LEVEL.LOW;
                   }
                }else if((v8 = l - 0x40000000) >= 0){
                   if (i >= linkedBlocki) {
                      SystemUtil.w = SystemUtil$LEVEL.MIDDLE;
                   }else if(i >= 2){
                      SystemUtil.w = SystemUtil$LEVEL.LOW;
                   }else if(i > 0){
                      SystemUtil.w = SystemUtil$LEVEL.LOW;
                   }
                }else if(null - l <= 0 && v8 < 0){
                   SystemUtil.w = SystemUtil$LEVEL.BAD;
                }else {
                   SystemUtil.w = SystemUtil$LEVEL.UN_KNOW;
                }
             }
             w = SystemUtil.w;
          }
          this.a = w;
       }
       c ta = this.a;
       String str = "glo-cal";
       if (ta != null && ta.getValue() < SystemUtil$LEVEL.MIDDLE.getValue()) {
          uoe = new e(2, c.o, 2, mINUTES, new LinkedBlockingQueue(512), new b(str));
          this.b = ta;
       }else {
          uoe = new e(c.n, c.o, (long)3, mINUTES, new LinkedBlockingQueue(1024), new b(str));
          this.b = ta;
       }
       ta = this.b;
       ta.c = true;
       ta.allowCoreThreadTimeOut(true);
       this.d = b.b(this.b);
       uoe = new e(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new b("glo-io"));
       this.c = ta;
       return;
    }
    public void c(c$a p0){
       e uoe;
       super();
       this.a = null;
       this.f = new LinkedBlockingQueue();
       this.g = Executors.newSingleThreadExecutor(new b("async-log"));
       TimeUnit mINUTES = TimeUnit.MINUTES;
       Context k = c.k;
       if (k != null) {
          SystemUtil$LEVEL w = SystemUtil.w;
          if (w == null) {
             long l = SystemUtil.C(k);
             int i = Runtime.getRuntime().availableProcessors();
             if (l - 0x100000000 >= 0) {
                SystemUtil.w = SystemUtil$LEVEL.BEST;
             }else if(l - 0xc0000000 >= 0){
                SystemUtil.w = SystemUtil$LEVEL.HIGH;
             }else {
                LinkedBlockingQueue linkedBlocki = 4;
                if (l - 0x80000000 >= 0) {
                   if (i >= linkedBlocki) {
                      SystemUtil.w = SystemUtil$LEVEL.HIGH;
                   }else if(i >= 2){
                      SystemUtil.w = SystemUtil$LEVEL.MIDDLE;
                   }else if(i > 0){
                      SystemUtil.w = SystemUtil$LEVEL.LOW;
                   }
                }else if((v7 = l - 0x40000000) >= 0){
                   if (i >= linkedBlocki) {
                      SystemUtil.w = SystemUtil$LEVEL.MIDDLE;
                   }else if(i >= 2){
                      SystemUtil.w = SystemUtil$LEVEL.LOW;
                   }else if(i > 0){
                      SystemUtil.w = SystemUtil$LEVEL.LOW;
                   }
                }else if(0 - l <= 0 && v7 < 0){
                   SystemUtil.w = SystemUtil$LEVEL.BAD;
                }else {
                   SystemUtil.w = SystemUtil$LEVEL.UN_KNOW;
                }
             }
             w = SystemUtil.w;
          }
          this.a = w;
       }
       c ta = this.a;
       String str = "glo-cal";
       if (ta != null && ta.getValue() < SystemUtil$LEVEL.MIDDLE.getValue()) {
          uoe = new e(2, c.o, 2, mINUTES, new LinkedBlockingQueue(512), new b(str));
          this.b = ta.getValue();
       }else {
          uoe = new e(c.n, c.o, (long)3, mINUTES, new LinkedBlockingQueue(1024), new b(str));
          this.b = ta.getValue();
       }
       ta = this.b;
       ta.c = true;
       ta.allowCoreThreadTimeOut(true);
       this.d = b.b(this.b);
       uoe = new e(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new b("glo-io"));
       this.c = b.b(this.b);
       return;
    }
    public static void a(Runnable p0){
       c.d().execute(p0);
    }
    public static c b(){
       return c$b.a;
    }
    public static ExecutorService c(){
       if (c.i) {
          return d.b("global-io", 2);
       }
       return c.b().c;
    }
    public static ExecutorService d(){
       if (c.i) {
          return d.b("global-io", 2);
       }
       return c.b().b;
    }
    public static ExecutorService e(String p0,int p1){
       if (c.j) {
          return f.a(p0, p1);
       }
       e uoe = new e(p1, p1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b(p0));
       v8.allowCoreThreadTimeOut(true);
       return v8;
    }
    public static ExecutorService f(String p0){
       return c.e(p0, 1);
    }
    public static Future g(Runnable p0){
       FutureTask uFutureTask = new FutureTask(p0, null);
       if (c.b().h != null) {
          c.b().h.observeOn(d.c).doOnNext(new a(uFutureTask)).subscribe(Functions.d(), Functions.e);
       }else {
          c.a(uFutureTask);
       }
       return uFutureTask;
    }
    public static void h(Context p0){
       if (p0 != null) {
          c.k = p0;
       }
       return;
    }
    public static t j(Callable p0){
       return t.fromCallable(p0).subscribeOn(c.b().d).observeOn(a.c());
    }
    public static Future k(Runnable p0){
       return c.d().submit(p0);
    }
    public static Future l(Runnable p0){
       return c.d().submit(p0);
    }
    public static String m(String p0,String p1,int p2,int p3){
       return "{name:"+p0+", threadName:"+p1+", findSourceCost:"+p2+", duration: "+p3+"}";
    }
    public void i(t p0){
       this.h = p0;
    }
}
