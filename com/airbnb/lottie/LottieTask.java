package com.airbnb.lottie.LottieTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.LinkedHashSet;
import android.os.Handler;
import android.os.Looper;
import w4.m;
import java.lang.Throwable;
import com.airbnb.lottie.LottieTask$b;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import w4.j;
import java.util.Set;
import java.util.concurrent.FutureTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.airbnb.lottie.LottieTask$a;
import java.lang.IllegalStateException;
import java.lang.String;

public class LottieTask	// class@000d8e
{
    public final Set failureListeners;
    public final Handler handler;
    public LottieTask$b lottieFutureTask;
    public m result;
    public final Set successListeners;
    public static Executor EXECUTOR;

    static {
       LottieTask.EXECUTOR = Executors.newCachedThreadPool();
    }
    public void LottieTask(Callable p0){
       super(p0, false);
    }
    public void LottieTask(Callable p0,boolean p1){
       super();
       this.successListeners = new LinkedHashSet(1);
       this.failureListeners = new LinkedHashSet(1);
       this.handler = new Handler(Looper.getMainLooper());
       this.result = null;
       if (p1) {
          this.setResult(p0.call());
       }else {
          LottieTask$b uob = new LottieTask$b(this, p0);
          this.lottieFutureTask = uob;
          LottieTask.EXECUTOR.execute(uob);
       }
       return;
    }
    public synchronized LottieTask addFailureListener(j p0){
       if (this.result != null && this.result.a() != null) {
          p0.onResult(this.result.a());
       }
       this.failureListeners.add(p0);
       return this;
    }
    public synchronized LottieTask addListener(j p0){
       if (this.result != null && this.result.b() != null) {
          p0.onResult(this.result.b());
       }
       this.successListeners.add(p0);
       return this;
    }
    public void cancel(boolean p0){
       LottieTask tlottieFutur = this.lottieFutureTask;
       if (tlottieFutur != null) {
          tlottieFutur.cancel(p0);
       }
       return;
    }
    public synchronized void notifyFailureListeners(Throwable p0){
       ArrayList uArrayList = new ArrayList(this.failureListeners);
       if (uArrayList.isEmpty()) {
          return;
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onResult(p0);
       }
       return;
    }
    public final void notifyListeners(){
       this.handler.post(new LottieTask$a(this));
    }
    public synchronized void notifySuccessListeners(Object p0){
       Iterator iterator = new ArrayList(this.successListeners).iterator();
       while (iterator.hasNext()) {
          iterator.next().onResult(p0);
       }
       return;
    }
    public synchronized void removeAllListeners(){
       this.successListeners.clear();
       this.failureListeners.clear();
    }
    public synchronized LottieTask removeFailureListener(j p0){
       this.failureListeners.remove(p0);
       return this;
    }
    public synchronized LottieTask removeListener(j p0){
       this.successListeners.remove(p0);
       return this;
    }
    public void setResult(m p0){
       if (this.result != null) {
          throw new IllegalStateException("A task may only be set once.");
       }
       this.result = p0;
       this.notifyListeners();
       return;
    }
}
