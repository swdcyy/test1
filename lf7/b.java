package lf7.b;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Math;
import msd.a;
import kf7.a;
import lf7.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.lang.ClassLoader;
import java.lang.Thread;
import yrd.b;
import java.io.File;
import android.content.Context;

public final class b implements Comparator	// class@001d84
{
    public static final ConcurrentHashMap b;
    public static final AtomicInteger c;
    public static boolean d;
    public static final b e;

    static {
       b.e = new b();
       b.b = new ConcurrentHashMap();
       b.c = new AtomicInteger();
    }
    public void b(){
       super();
    }
    public static final ConcurrentHashMap a(b p0){
       return b.b;
    }
    public int b(DependencyTask p0,DependencyTask p1){
       a.q(p0, "left");
       a.q(p1, "right");
       int i = 0;
       if (!b.d) {
          return i;
       }
       long l = p0.y() - p1.y();
       if (Math.abs(l) - (long)2 > 0) {
          i = (int)l;
       }
       return i;
    }
    public final void c(a p0){
       ExecutorService c = a.c;
       if (c != null) {
          a uoa = (p0 != null)? new a(p0): p0;
          if (c.submit(uoa) != null) {
          label_0022 :
             return;
          }
       }
       b.c(false, false, null, null, 0, p0, 31, null);
       goto label_0022 ;
    }
    public int compare(Object p0,Object p1){
       return this.b(p0, p1);
    }
    public final File d(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getFilesDir(), "performance/startup/scheduler/taskCost.properties");
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       return uFile;
    }
}
