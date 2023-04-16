package ltd.e;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import msd.a;
import java.util.concurrent.locks.Lock;
import nsd.c0;

public final class e	// class@001e03
{
    public static final Method a;

    static {
       Class[] uClassArray = new Class[]{Boolean.TYPE};
       Method method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", uClassArray);
       e.a = method;
    }
    public static void a(){
    }
    public static final Set b(int p0){
       return Collections.newSetFromMap(new IdentityHashMap(p0));
    }
    public static final boolean c(Executor p0){
       if (!p0 instanceof ScheduledThreadPoolExecutor) {
          p0 = null;
       }
       if (p0 != null) {
          Method a = e.a;
          if (a != null) {
             Object[] objArray = new Object[]{Boolean.TRUE};
             a.invoke(p0, objArray);
             return 1;
          }
       }
       return 0;
    }
    public static final List d(){
       return new CopyOnWriteArrayList();
    }
    public static final Object e(ReentrantLock p0,a p1){
       p0.lock();
       c0.d(1);
       p0.unlock();
       c0.c(1);
       return p1.invoke();
    }
}
