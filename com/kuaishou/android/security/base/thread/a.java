package com.kuaishou.android.security.base.thread.a;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.Runtime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import com.kuaishou.android.security.base.thread.b;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.SynchronousQueue;
import com.kuaishou.android.security.base.thread.a$a;
import com.kuaishou.android.security.base.thread.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Runnable;
import java.util.concurrent.Future;

public class a	// class@000f12
{
    public final Executor a;
    public final ThreadPoolExecutor b;
    public final ThreadPoolExecutor c;
    public final BlockingQueue d;

    public void a(){
       super();
       this.a = Executors.newSingleThreadExecutor();
       this.d = new LinkedBlockingQueue();
       int i = Runtime.getRuntime().availableProcessors() * 2;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(i, i, (long)3, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b("ksguard-security-global-default-pool"));
       this.b = v9;
       v9.allowCoreThreadTimeOut(true);
       threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new b("global-cached-pool"));
       this.c = v0;
    }
    public void a(a$a p0){
       super();
    }
    public static a a(){
       return a$b.a;
    }
    public static String a(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "{name_:"+p0+", threadName:"+p1+", findSourceCost:"+p2+", duration: "+p3+"}";
    }
    public static ThreadPoolExecutor a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 1);
    }
    public static ThreadPoolExecutor a(String p0,int p1){
       Object obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p1, p1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b(p0));
       obj.allowCoreThreadTimeOut(true);
       return obj;
    }
    public static ThreadPoolExecutor a(String p0,int p1,BlockingQueue p2){
       Object obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p1, p1, 1, TimeUnit.MINUTES, p2, new b(p0));
       obj.allowCoreThreadTimeOut(true);
       return obj;
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       a.a().b.execute(p0);
       return;
    }
    public static Future b(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().b.submit(p0);
    }
    public static ThreadPoolExecutor b(){
       Object obj = PatchProxy.apply(null, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().c;
    }
    public void c(){
    }
}
