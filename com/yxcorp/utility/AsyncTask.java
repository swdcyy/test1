package com.yxcorp.utility.AsyncTask;
import java.lang.Runtime;
import com.yxcorp.utility.AsyncTask$a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import com.yxcorp.utility.AsyncTask$g;
import com.yxcorp.utility.AsyncTask$f;
import java.lang.Object;
import com.yxcorp.utility.AsyncTask$Status;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.utility.AsyncTask$b;
import com.yxcorp.utility.AsyncTask$c;
import java.util.concurrent.Callable;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import com.yxcorp.utility.AsyncTask$d;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.lang.String;
import com.yxcorp.utility.AsyncTask$h;
import com.yxcorp.utility.AsyncTask$e;
import android.os.Message;
import android.os.Handler;

public abstract class AsyncTask	// class@0009a6
{
    public final AsyncTask$h b;
    public final FutureTask c;
    public AsyncTask$Status d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final ThreadFactory j;
    public static final BlockingQueue k;
    public static final Executor l;
    public static final Executor m;
    public static final AsyncTask$f n;
    public static Executor o;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       AsyncTask.g = i;
       int i1 = i + 1;
       AsyncTask.h = i1;
       int i2 = (i * 2) + 1;
       AsyncTask.i = i2;
       AsyncTask$a uoa = new AsyncTask$a();
       AsyncTask.j = uoa;
       LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue(128);
       AsyncTask.k = linkedBlocki;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(i1, i2, 1, TimeUnit.SECONDS, linkedBlocki, uoa);
       AsyncTask.l = i;
       AsyncTask$g og = new AsyncTask$g();
       AsyncTask.m = og;
       AsyncTask.n = new AsyncTask$f();
       AsyncTask.o = og;
    }
    public void AsyncTask(){
       super();
       this.d = AsyncTask$Status.PENDING;
       this.e = new AtomicBoolean();
       this.f = new AtomicBoolean();
       AsyncTask$b uob = new AsyncTask$b(this);
       this.b = uob;
       this.c = new AsyncTask$c(this, uob);
    }
    public static void d(Runnable p0){
       AsyncTask.o.execute(p0);
    }
    public final boolean a(boolean p0){
       this.e.set(true);
       return this.c.cancel(p0);
    }
    public abstract Object b(Object[] p0);
    public final AsyncTask c(Object[] p0){
       this.e(AsyncTask.o, p0);
       return this;
    }
    public final AsyncTask e(Executor p0,Object[] p1){
       if (this.d != AsyncTask$Status.PENDING) {
          int i = AsyncTask$d.a[this.d.ordinal()];
          if (i != 1) {
             if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed \(a task can be executed only once\)");
             }
          }else {
             throw new IllegalStateException("Cannot execute task: the task is already running.");
          }
       }
       this.d = AsyncTask$Status.RUNNING;
       this.k();
       this.b.b = p1;
       p0.execute(this.c);
       return this;
    }
    public final AsyncTask$Status f(){
       return this.d;
    }
    public final boolean g(){
       return this.e.get();
    }
    public void h(){
    }
    public void i(Object p0){
       this.h();
    }
    public void j(Object p0){
    }
    public void k(){
    }
    public void l(Object[] p0){
    }
    public Object m(Object p0){
       Object[] objArray = new Object[]{p0};
       AsyncTask.n.obtainMessage(1, new AsyncTask$e(this, objArray)).sendToTarget();
       return p0;
    }
    public void n(Object p0){
       if (!this.f.get()) {
          this.m(p0);
       }
       return;
    }
    public final void o(Object[] p0){
       if (!this.g()) {
          AsyncTask.n.obtainMessage(2, new AsyncTask$e(this, p0)).sendToTarget();
       }
       return;
    }
}
