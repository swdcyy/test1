package pf7.a;
import pf7.c;
import kf7.a;
import java.lang.Runtime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Runnable;

public final class a implements c	// class@0021b3
{
    public static final ExecutorService a;
    public static final AtomicInteger b;
    public static int c;
    public static final a d;

    static {
       int maximumPoolS;
       a.d = new a();
       ExecutorService b = a.b;
       if (b != null) {
       }else {
          maximumPoolS = Runtime.getRuntime().availableProcessors();
          AtomicInteger uAtomicInteg = 2;
          maximumPoolS = (maximumPoolS <= uAtomicInteg)? 1: maximumPoolS / uAtomicInteg;
          b = Executors.newFixedThreadPool(maximumPoolS);
       }
       a.a = b;
       a.b = new AtomicInteger();
       if (b instanceof ThreadPoolExecutor) {
          maximumPoolS = b.getMaximumPoolSize();
          if (maximumPoolS > 6) {
             maximumPoolS = 6;
          }
       }else {
          maximumPoolS = 3;
       }
       a.c = maximumPoolS;
    }
    public void a(){
       super();
    }
    public void a(DependencyTask p0){
       a.q(p0, "task");
       p0.A(1);
       a.a.execute(p0);
    }
    public final void b(){
       a.b.decrementAndGet();
    }
}
