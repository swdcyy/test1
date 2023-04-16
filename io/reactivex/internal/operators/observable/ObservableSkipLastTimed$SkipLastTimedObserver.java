package io.reactivex.internal.operators.observable.ObservableSkipLastTimed$SkipLastTimedObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.queue.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSkipLastTimed$SkipLastTimedObserver extends AtomicInteger implements y, b	// class@00136b
{
    public final y actual;
    public boolean cancelled;
    public final boolean delayError;
    public boolean done;
    public Throwable error;
    public final a queue;
    public b s;
    public final z scheduler;
    public final long time;
    public final TimeUnit unit;
    public static final long serialVersionUID = 0xb135fbcb96a6b645;

    public void ObservableSkipLastTimed$SkipLastTimedObserver(y p0,long p1,TimeUnit p2,z p3,int p4,boolean p5){
       super();
       this.actual = p0;
       this.time = p1;
       this.unit = p2;
       this.scheduler = p3;
       this.queue = new a(p4);
       this.delayError = p5;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.dispose();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public void drain(){
       ObservableSkipLastTimed$SkipLastTimedObserver skipLastTime = this;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableSkipLastTimed$SkipLastTimedObserver actual = skipLastTime.actual;
       ObservableSkipLastTimed$SkipLastTimedObserver queue = skipLastTime.queue;
       ObservableSkipLastTimed$SkipLastTimedObserver delayError = skipLastTime.delayError;
       ObservableSkipLastTimed$SkipLastTimedObserver unit = skipLastTime.unit;
       ObservableSkipLastTimed$SkipLastTimedObserver scheduler = skipLastTime.scheduler;
       ObservableSkipLastTimed$SkipLastTimedObserver time = skipLastTime.time;
       int i = 1;
       while (true) {
          if (skipLastTime.cancelled != null) {
             skipLastTime.queue.clear();
             return;
          }else {
             ObservableSkipLastTimed$SkipLastTimedObserver done = skipLastTime.done;
             Long longx = queue.peek();
             int i1 = (longx == null)? 1: 0;
             long l = scheduler.c(unit);
             if (!i1) {
                l = l - time;
                if (longx.longValue() - l > 0) {
                   i1 = 1;
                }
             }
             if (done != null) {
                if (delayError != null) {
                   if (i1) {
                      queue = skipLastTime.error;
                      if (queue != null) {
                         actual.onError(queue);
                         break ;
                      }else {
                         actual.onComplete();
                         break ;
                      }
                   }
                }else {
                   done = skipLastTime.error;
                   if (done != null) {
                      skipLastTime.queue.clear();
                      actual.onError(done);
                      return;
                   }else if(i1){
                      actual.onComplete();
                      return;
                   }
                }
             }
             if (i1) {
                i = - i;
                if (!skipLastTime.addAndGet(i)) {
                   return;
                }
             }else {
                queue.poll();
                actual.onNext(queue.poll());
             }
          }
       }
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
       this.queue.offer(Long.valueOf(this.scheduler.c(this.unit)), p0);
       this.drain();
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
