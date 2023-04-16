package io.reactivex.internal.operators.observable.ObservableThrottleLatest$ThrottleLatestObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableThrottleLatest$ThrottleLatestObserver extends AtomicInteger implements y, b, Runnable	// class@001377
{
    public boolean cancelled;
    public boolean done;
    public final y downstream;
    public final boolean emitLast;
    public Throwable error;
    public final AtomicReference latest;
    public final long timeout;
    public boolean timerFired;
    public boolean timerRunning;
    public final TimeUnit unit;
    public b upstream;
    public final z$c worker;
    public static final long serialVersionUID = 0x8cdc3d32432535ea;

    public void ObservableThrottleLatest$ThrottleLatestObserver(y p0,long p1,TimeUnit p2,z$c p3,boolean p4){
       super();
       this.downstream = p0;
       this.timeout = p1;
       this.unit = p2;
       this.worker = p3;
       this.emitLast = p4;
       this.latest = new AtomicReference();
    }
    public void dispose(){
       this.cancelled = true;
       this.upstream.dispose();
       this.worker.dispose();
       if (!this.getAndIncrement()) {
          this.latest.lazySet(null);
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableThrottleLatest$ThrottleLatestObserver tlatest = this.latest;
       ObservableThrottleLatest$ThrottleLatestObserver tdownstream = this.downstream;
       ObservableThrottleLatest$ThrottleLatestObserver throttleLate = 1;
       int i = 1;
       while (true) {
          Object obj = null;
          if (this.cancelled != null) {
             tlatest.lazySet(obj);
             return;
          }else {
             ObservableThrottleLatest$ThrottleLatestObserver tdone = this.done;
             if (tdone != null && this.error != null) {
                tlatest.lazySet(obj);
                tdownstream.onError(this.error);
                this.worker.dispose();
                return;
             }else {
                boolean b = false;
                ObservableThrottleLatest$ThrottleLatestObserver throttleLate1 = (tlatest.get() == null)? 1: null;
                if (tdone != null) {
                   Object andSet = tlatest.getAndSet(obj);
                   if (!throttleLate1 && this.emitLast != null) {
                      tdownstream.onNext(andSet);
                      break ;
                   }
                   break ;
                }else if(throttleLate1){
                   if (this.timerFired != null) {
                      this.timerRunning = b;
                      this.timerFired = b;
                   }
                }else if(this.timerRunning == null || this.timerFired != null){
                   tdownstream.onNext(tlatest.getAndSet(obj));
                   this.timerFired = b;
                   this.timerRunning = throttleLate;
                   this.worker.c(this, this.timeout, this.unit);
                }
                i = - i;
                if (!this.addAndGet(i)) {
                   return;
                }
             }
          }
       }
       tdownstream.onComplete();
       this.worker.dispose();
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.done = true;
       this.drain();
    }
    public void onNext(Object p0){
       this.latest.set(p0);
       this.drain();
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.downstream.onSubscribe(this);
       }
       return;
    }
    public void run(){
       this.timerFired = true;
       this.drain();
    }
}
