package io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import java.util.concurrent.Callable;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.a;

public final class ObservableConcatMap$ConcatMapDelayErrorObserver extends AtomicInteger implements y, b	// class@001888
{
    public boolean active;
    public final y actual;
    public final int bufferSize;
    public boolean cancelled;
    public b d;
    public boolean done;
    public final AtomicThrowable error;
    public final o mapper;
    public final ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver observer;
    public o queue;
    public int sourceMode;
    public final boolean tillTheEnd;
    public static final long serialVersionUID = 0x9f88bb6078833019;

    public void ObservableConcatMap$ConcatMapDelayErrorObserver(y p0,o p1,int p2,boolean p3){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.bufferSize = p2;
       this.tillTheEnd = p3;
       this.error = new AtomicThrowable();
       this.observer = new ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver(p0, this);
    }
    public void dispose(){
       this.cancelled = true;
       this.d.dispose();
       this.observer.dispose();
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableConcatMap$ConcatMapDelayErrorObserver tactual = this.actual;
       ObservableConcatMap$ConcatMapDelayErrorObserver tqueue = this.queue;
       ObservableConcatMap$ConcatMapDelayErrorObserver terror = this.error;
       while (true) {
          if (this.active == null) {
             if (this.cancelled != null) {
                tqueue.clear();
                return;
             }else {
                boolean b = true;
                if (this.tillTheEnd == null && terror.get() != null) {
                   tqueue.clear();
                   this.cancelled = b;
                   tactual.onError(terror.terminate());
                   return;
                }else {
                   ObservableConcatMap$ConcatMapDelayErrorObserver tdone = this.done;
                   Object obj = tqueue.poll();
                   int i = (obj == null)? 1: 0;
                   if (tdone != null && i) {
                      this.cancelled = b;
                      Throwable throwable = terror.terminate();
                      if (throwable != null) {
                         tactual.onError(throwable);
                         break ;
                      }else {
                         tactual.onComplete();
                         break ;
                      }
                   }else if(!i){
                      Object obj1 = this.mapper.apply(obj);
                      a.c(obj1, "The mapper returned a null ObservableSource");
                      if (obj1 instanceof Callable) {
                         obj1 = obj1.call();
                         if (obj1 != null && this.cancelled == null) {
                            tactual.onNext(obj1);
                         }
                      }else {
                         this.active = b;
                         obj1.subscribe(this.observer);
                      label_00b4 :
                         if (!this.decrementAndGet()) {
                            return;
                         }
                      }
                   }else {
                      goto label_00b4 ;
                   }
                }
             }
          }else {
             goto label_00b4 ;
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
       if (this.error.addThrowable(p0)) {
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.sourceMode == null) {
          this.queue.offer(p0);
       }
       this.drain();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          if (p0 instanceof j) {
             int i = p0.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.sourceMode = i;
                this.queue = p0;
                this.done = b;
                this.actual.onSubscribe(this);
                this.drain();
                return;
             }else if(i == 2){
                this.sourceMode = i;
                this.queue = p0;
                this.actual.onSubscribe(this);
                return;
             }
          }
          this.queue = new a(this.bufferSize);
          this.actual.onSubscribe(this);
       }
       return;
    }
}
