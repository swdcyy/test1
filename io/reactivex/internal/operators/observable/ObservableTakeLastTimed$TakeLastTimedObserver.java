package io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.queue.a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Long;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableTakeLastTimed$TakeLastTimedObserver extends AtomicBoolean implements y, b	// class@001372
{
    public final y actual;
    public boolean cancelled;
    public final long count;
    public b d;
    public final boolean delayError;
    public Throwable error;
    public final a queue;
    public final z scheduler;
    public final long time;
    public final TimeUnit unit;
    public static final long serialVersionUID = 0xb135fbcb96a6b645;

    public void ObservableTakeLastTimed$TakeLastTimedObserver(y p0,long p1,long p2,TimeUnit p3,z p4,int p5,boolean p6){
       super();
       this.actual = p0;
       this.count = p1;
       this.time = p2;
       this.unit = p3;
       this.scheduler = p4;
       this.queue = new a(p5);
       this.delayError = p6;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.d.dispose();
          if (this.compareAndSet(false, true)) {
             this.queue.clear();
          }
       }
       return;
    }
    public void drain(){
       if (!this.compareAndSet(false, true)) {
          return;
       }
       ObservableTakeLastTimed$TakeLastTimedObserver tactual = this.actual;
       ObservableTakeLastTimed$TakeLastTimedObserver tqueue = this.queue;
       ObservableTakeLastTimed$TakeLastTimedObserver tdelayError = this.delayError;
       while (true) {
          if (this.cancelled != null) {
             tqueue.clear();
             return;
          }else if(tdelayError == null){
             ObservableTakeLastTimed$TakeLastTimedObserver terror = this.error;
             if (terror != null) {
                tqueue.clear();
                tactual.onError(terror);
                return;
             }
          }
          Object obj = tqueue.poll();
          Long longx = (obj == null)? 1: null;
          if (longx) {
             ObservableTakeLastTimed$TakeLastTimedObserver terror1 = this.error;
             if (terror1 != null) {
                tactual.onError(terror1);
                break ;
             }else {
                tactual.onComplete();
                break ;
             }
          }else {
             longx = tqueue.poll();
             long l = this.scheduler.c(this.unit) - this.time;
             if (obj.longValue() - l < 0) {
                continue ;
             }else {
                tactual.onNext(longx);
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       this.drain();
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.drain();
    }
    public void onNext(Object p0){
       ObservableTakeLastTimed$TakeLastTimedObserver takeLastTime = this;
       ObservableTakeLastTimed$TakeLastTimedObserver queue = takeLastTime.queue;
       long l = takeLastTime.scheduler.c(takeLastTime.unit);
       ObservableTakeLastTimed$TakeLastTimedObserver time = takeLastTime.time;
       ObservableTakeLastTimed$TakeLastTimedObserver count = takeLastTime.count;
       int i = (!count - Long.MAX_VALUE)? 1: 0;
       queue.offer(Long.valueOf(l), p0);
       while (!queue.isEmpty()) {
          long l1 = l - time;
          if (queue.peek().longValue() - l1 > 0) {
             if (!i) {
                long l2 = queue.f();
                l1 = queue.i();
                long l3 = queue.f();
                while (l2 - l3) {
                   l2 = l3;
                }
                l1 = l1 - l3;
                int i1 = (int)l1 >> 1;
                if ((long)i1 - count <= 0) {
                }
             }else {
                break ;
             }
          }
          queue.poll();
          queue.poll();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
