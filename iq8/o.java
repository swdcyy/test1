package iq8.o;
import java.lang.Runtime;
import java.lang.Math;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import iq8.o$c;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import iq8.o$b;
import iq8.o$a;
import java.util.concurrent.RejectedExecutionHandler;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import zp8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class o	// class@00271b
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final ThreadPoolExecutor d;
    public static final ThreadPoolExecutor e;
    public static ThreadPoolExecutor f;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       o.a = i;
       ThreadPoolExecutor threadPoolEx = 2;
       int i1 = (i == 1)? i: Math.max(threadPoolEx, Math.min((i - 1), 4));
       o.b = i1;
       int i2 = (i * 2) + 1;
       o.c = i2;
       o.f = null;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       ThreadPoolExecutor threadPoolEx1 = new ThreadPoolExecutor(1, 1, 30, sECONDS, new LinkedBlockingQueue(), new o$c("tk-backup-pool"));
       o.d = threadPoolEx;
       ThreadPoolExecutor threadPoolEx2 = new ThreadPoolExecutor(i1, i2, 30, sECONDS, new LinkedBlockingQueue(128), new o$c("tk-async-pool"));
       o.e = threadPoolEx;
       threadPoolEx.setRejectedExecutionHandler(new o$b(null));
       o.f = o.b();
    }
    public void o(){
       super();
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, o.class, "1")) {
          return;
       }
       try{
          o.e.execute(p0);
       }catch(java.lang.Exception e3){
          a.j("TKAsync", e3.getMessage());
       }
       return;
    }
    public static ThreadPoolExecutor b(){
       Object obj = PatchProxy.apply(null, null, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (o.f == null) {
          o.f = o.c("tk-single-thread-pool", 1);
       }
       return o.f;
    }
    public static ThreadPoolExecutor c(String p0,int p1){
       Object obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oo, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p1, p1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o$c(p0));
       return obj;
    }
}
