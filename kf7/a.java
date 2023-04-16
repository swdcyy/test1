package kf7.a;
import java.util.concurrent.CopyOnWriteArrayList;
import rf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import rf7.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qf7.b;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import pf7.b;
import sf7.a;
import pf7.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Looper;
import kf7.a$a;
import uf7.a;
import java.lang.Runnable;
import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.ArrayList;
import qrd.l1;
import java.util.Iterator;
import com.kwai.performance.fluency.startup.scheduler.executor.RealTimeThreadExecutor;
import qrd.p;
import java.util.concurrent.ExecutorService;

public final class a	// class@001c06
{
    public static final CopyOnWriteArrayList a;
    public static ExecutorService b;
    public static ExecutorService c;
    public static Context d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static final a k;

    static {
       a.k = new a();
       a.a = new CopyOnWriteArrayList();
       a.a(a.t);
       a.a(b.t);
    }
    public void a(){
       super();
    }
    public static final a a(DependencyTask p0){
       a.q(p0, "task");
       a k = a.k;
       if (a.j) {
          b.a(p0, false, 2, null);
       }else {
          a.a.add(p0);
       }
       return k;
    }
    public static final List c(){
       return CollectionsKt___CollectionsKt.G5(a.a);
    }
    public static final void d(){
       a k = a.k;
       k.e();
       k.g();
       k.f();
    }
    public final void b(){
       boolean b = true;
       b.a = b;
       DependencyTask uDependencyT = b.f(b);
       while (uDependencyT != null) {
          if (uDependencyT instanceof a) {
             continue ;
          }else {
             b.b.a(uDependencyT);
          }
       }
       b.a = false;
       return;
    }
    public final void e(){
       DependencyTask uDependencyT;
       if (a.g) {
          return;
       }
       if (!b.e(false)) {
          Objects.requireNonNull(a.d);
          a uoa = (a.b.get() >= a.c)? 1: null;
          if (!uoa) {
             while (true) {
                uoa = a.d;
                Objects.requireNonNull(uoa);
                if (a.b.incrementAndGet() <= a.c) {
                   uDependencyT = 1;
                label_0034 :
                   if (uDependencyT) {
                      uDependencyT = b.f(false);
                      if (uDependencyT != null) {
                         uoa.a(uDependencyT);
                      }
                   }
                   uoa.b();
                   break ;
                }else {
                   uDependencyT = null;
                   goto label_0034 ;
                }
             }
          }
       }
       return;
    }
    public final void f(){
       a$a b;
       if (a.g) {
          return;
       }
       if (!b.a && !b.e(true)) {
          if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
             this.b();
          }else {
             b = a$a.b;
             a.q(b, "runnable");
             a.a.postDelayed(b, 0);
          }
       }
       return;
    }
    public final void g(){
       if (a.g) {
          return;
       }
       if (b.e(false)) {
          return;
       }
       LinkedList c = b.c;
       Iterable iterable = null;
       if (!c.isEmpty()) {
          ReentrantLock e = b.e;
          e.lock();
          DependencyTask uDependencyT1 = CollectionsKt___CollectionsKt.p2(c);
          if (uDependencyT1 != null && uDependencyT1.priority() == Integer.MAX_VALUE) {
             iterable = new ArrayList();
             do {
                c = b.c;
                Object obj = c.removeFirst();
                a.h(obj, "mChildThreadPipeline.removeFirst\(\)");
                iterable.add(obj);
                uDependencyT1 = CollectionsKt___CollectionsKt.p2(c);
             } while (uDependencyT1 == null || uDependencyT1.priority() != Integer.MAX_VALUE);
             e.unlock();
          }else {
             e.unlock();
          }
       }
       if (iterable != null) {
          Iterator iterator = iterable.iterator();
          while (iterator.hasNext()) {
             DependencyTask uDependencyT = iterator.next();
             Objects.requireNonNull(RealTimeThreadExecutor.b);
             a.q(uDependencyT, "task");
             uDependencyT.A(2);
             RealTimeThreadExecutor.a.getValue().execute(uDependencyT);
          }
       }
       return;
    }
}
