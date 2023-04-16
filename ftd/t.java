package ftd.t;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import zsd.t;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.util.concurrent.Executor;
import msd.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import ftd.t$a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.SecurityManager;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.Number;
import java.lang.Runtime;
import usd.q;
import ftd.t$b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ftd.p0;
import ftd.h1;
import ftd.t$c;
import kotlin.coroutines.CoroutineContext;
import ftd.j3;
import ftd.k3;

public final class t extends ExecutorCoroutineDispatcher	// class@000ecd
{
    public static final int d;
    public static boolean e;
    public static final t f;
    public static Executor pool;

    static {
       int i;
       t.f = new t();
       String property = System.getProperty("kotlinx.coroutines.default.parallelism");
       if (property != null) {
          Integer integer = t.X0(property);
          if (integer != null && integer.intValue() >= 1) {
             i = integer.intValue();
          }else {
             throw new IllegalStateException("Expected positive number in kotlinx.coroutines.default.parallelism, but has "+property.toString());
          }
       }else {
          i = -1;
       }
       t.d = i;
    }
    public void t(){
       super();
    }
    public Executor A(){
       Executor pool = t.pool;
       if (pool != null) {
       }else {
          pool = this.f0();
       }
       return pool;
    }
    public final Object T(a p0){
       p0 = p0.invoke();
       return p0;
    }
    public final ExecutorService Y(){
       return Executors.newFixedThreadPool(this.g0(), new t$a(new AtomicInteger()));
    }
    public final ExecutorService b0(){
       Class[] uClassArray;
       Object[] obj1;
       if (System.getSecurityManager() != null) {
          return this.Y();
       }
       Object obj = null;
       Class uClass = Class.forName("java.util.concurrent.ForkJoinPool");
       if (uClass == null) {
          return this.Y();
       }
       if (!t.e && t.d < 0) {
          uClassArray = new Class[0];
          Method method = uClass.getMethod("commonPool", uClassArray);
          if (method != null) {
             Object[] objArray = new Object[0];
             obj1 = method.invoke(obj, objArray);
          }else {
             obj1 = obj;
          }
          if (!obj1 instanceof ExecutorService) {
             obj1 = obj;
          }
          if (obj1 != null) {
             if (!t.f.h0(uClass, obj1)) {
                obj1 = obj;
             }
             if (obj1 != null) {
                return obj1;
             }
          }
       }
    label_0049 :
       uClassArray = new Class[]{Integer.TYPE};
       obj1 = new Object[]{Integer.valueOf(t.f.g0())};
       Object obj2 = uClass.getConstructor(uClassArray).newInstance(obj1);
       if (!obj2 instanceof ExecutorService) {
          obj2 = obj;
       }
       obj = obj2;
       if (obj != null) {
          return obj;
       }else {
          return this.Y();
       }
    }
    public void close(){
       throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
    public synchronized final Executor f0(){
       Executor pool = t.pool;
       if (pool != null) {
       }else {
          pool = this.b0();
          t.pool = pool;
       }
       return pool;
    }
    public final int g0(){
       Integer integer = Integer.valueOf(t.d);
       int i = (integer.intValue() > 0)? 1: 0;
       if (!i) {
          integer = null;
       }
       int i1 = (integer != null)? integer.intValue(): q.n((Runtime.getRuntime().availableProcessors() - 1), 1);
       return i1;
    }
    public final boolean h0(Class p0,ExecutorService p1){
       int i2;
       p1.submit(t$b.b);
       int i = 0;
       int i1 = 0;
       Class[] uClassArray = new Class[i1];
       Object[] objArray = new Object[i1];
       p0 = p0.getMethod("getPoolSize", uClassArray).invoke(p1, objArray);
       if (!p0 instanceof Integer) {
          i2 = i;
       }
       Object obj = i2;
       if (obj != null && obj.intValue() >= 1) {
          i1 = true;
       }
       return i1;
    }
    public synchronized final void i0(){
       this.j0(0);
       t.e = false;
       t.pool = null;
    }
    public synchronized final void j0(long p0){
       Executor pool = t.pool;
       if (!pool instanceof ExecutorService) {
          pool = null;
       }
       if (pool != null) {
          pool.shutdown();
          if (p0 - null > 0) {
             pool.awaitTermination(p0, TimeUnit.MILLISECONDS);
          }
          Iterator iterator = pool.shutdownNow().iterator();
          while (iterator.hasNext()) {
             p0.i.w0(iterator.next());
          }
       }
       t.pool = t$c.b;
       return;
    }
    public synchronized final void k0(){
       this.j0(0);
       t.e = true;
       t.pool = null;
    }
    public String toString(){
       return "CommonPool";
    }
    public void u(CoroutineContext p0,Runnable p1){
       Runnable runnable;
       try{
          Executor pool = t.pool;
          if (pool != null) {
          }else {
             pool = this.f0();
          }
          j3 oj31 = k3.b();
          if (oj31 != null) {
             runnable = oj31.i(p1);
             if (runnable != null) {
             label_0017 :
                pool.execute(runnable);
             }
          }
          runnable = p1;
          goto label_0017 ;
       }catch(java.util.concurrent.RejectedExecutionException e0){
          j3 oj3 = k3.b();
          if (oj3 != null) {
             oj3.b();
          }
          p0.i.w0(p1);
       }
       return;
    }
}
