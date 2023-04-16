package io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver;
import brd.y;
import crd.b;
import io.reactivex.internal.observers.j;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.ArrayDeque;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.observers.InnerQueuedObserver;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.a;

public final class ObservableConcatMapEager$ConcatMapEagerMainObserver extends AtomicInteger implements y, b, j	// class@0012f6
{
    public int activeCount;
    public final y actual;
    public boolean cancelled;
    public InnerQueuedObserver current;
    public b d;
    public boolean done;
    public final AtomicThrowable error;
    public final ErrorMode errorMode;
    public final o mapper;
    public final int maxConcurrency;
    public final ArrayDeque observers;
    public final int prefetch;
    public o queue;
    public int sourceMode;
    public static final long serialVersionUID = 0x7023f1bcc236905e;

    public void ObservableConcatMapEager$ConcatMapEagerMainObserver(y p0,o p1,int p2,int p3,ErrorMode p4){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.maxConcurrency = p2;
       this.prefetch = p3;
       this.errorMode = p4;
       this.error = new AtomicThrowable();
       this.observers = new ArrayDeque();
    }
    public void dispose(){
       this.cancelled = true;
       if (!this.getAndIncrement()) {
          this.queue.clear();
          this.disposeAll();
       }
       return;
    }
    public void disposeAll(){
       ObservableConcatMapEager$ConcatMapEagerMainObserver tcurrent = this.current;
       if (tcurrent != null) {
          tcurrent.dispose();
       }
       InnerQueuedObserver innerQueuedO = this.observers.poll();
       while (innerQueuedO != null) {
          innerQueuedO.dispose();
       }
       return;
    }
    public void drain(){
       InnerQueuedObserver innerQueuedO;
       InnerQueuedObserver innerQueuedO1;
       int i2;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableConcatMapEager$ConcatMapEagerMainObserver tqueue = this.queue;
       ObservableConcatMapEager$ConcatMapEagerMainObserver tobservers = this.observers;
       ObservableConcatMapEager$ConcatMapEagerMainObserver tactual = this.actual;
       ObservableConcatMapEager$ConcatMapEagerMainObserver terrorMode = this.errorMode;
       int i = 1;
    label_0011 :
       ObservableConcatMapEager$ConcatMapEagerMainObserver tactiveCount = this.activeCount;
       while (true) {
          if (tactiveCount != this.maxConcurrency) {
             if (this.cancelled != null) {
                tqueue.clear();
                this.disposeAll();
                return;
             }else if(terrorMode == ErrorMode.IMMEDIATE && this.error.get() != null){
                tqueue.clear();
                this.disposeAll();
                tactual.onError(this.error.terminate());
                return;
             }else {
                Object obj = tqueue.poll();
                if (obj == null) {
                label_0082 :
                   this.activeCount = tactiveCount;
                   if (this.cancelled != null) {
                      tqueue.clear();
                      this.disposeAll();
                      return;
                   }else if(terrorMode == ErrorMode.IMMEDIATE && this.error.get() != null){
                      tqueue.clear();
                      this.disposeAll();
                      tactual.onError(this.error.terminate());
                      return;
                   }else {
                      tactiveCount = this.current;
                      if (tactiveCount == null) {
                         if (terrorMode == ErrorMode.BOUNDARY && this.error.get() != null) {
                            tqueue.clear();
                            this.disposeAll();
                            tactual.onError(this.error.terminate());
                            return;
                         }else {
                            tactiveCount = this.done;
                            innerQueuedO = tobservers.poll();
                            ObservableConcatMapEager$ConcatMapEagerMainObserver uConcatMapEa = (innerQueuedO == null)? 1: null;
                            if (tactiveCount != null && uConcatMapEa) {
                               if (this.error.get() != null) {
                                  tqueue.clear();
                                  this.disposeAll();
                                  tactual.onError(this.error.terminate());
                                  break ;
                               }else {
                                  tactual.onComplete();
                                  break ;
                               }
                            }else if(!uConcatMapEa){
                               this.current = innerQueuedO;
                            }
                            innerQueuedO1 = innerQueuedO;
                         }
                      }
                      if (innerQueuedO1 != null) {
                         o oo = innerQueuedO1.queue();
                         while (true) {
                            if (this.cancelled != null) {
                               tqueue.clear();
                               this.disposeAll();
                               return;
                            }else {
                               boolean b = innerQueuedO1.isDone();
                               if (terrorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                                  tqueue.clear();
                                  this.disposeAll();
                                  tactual.onError(this.error.terminate());
                                  return;
                               }else {
                                  InnerQueuedObserver innerQueuedO2 = null;
                                  Object obj1 = oo.poll();
                                  int i1 = (obj1 == null)? 1: 0;
                                  if (b && i1) {
                                     this.current = innerQueuedO2;
                                     i2 = this.activeCount - 1;
                                     this.activeCount = i2;
                                     goto label_0011 ;
                                  }else if(i1){
                                     tactual.onNext(obj1);
                                  }
                               }
                            }
                         }
                         return;
                      }
                      i = - i;
                      if (!this.addAndGet(i)) {
                         return;
                      }else {
                         goto label_0011 ;
                      }
                   }
                }else {
                   obj = this.mapper.apply(obj);
                   a.c(obj, "The mapper returned a null ObservableSource");
                   innerQueuedO = new InnerQueuedObserver(this, this.prefetch);
                   tobservers.offer(innerQueuedO);
                   obj.subscribe(innerQueuedO);
                   i2 = tactiveCount + 1;
                }
             }
          }else {
             goto label_0082 ;
          }
       }
    }
    public void innerComplete(InnerQueuedObserver p0){
       p0.setDone();
       this.drain();
    }
    public void innerError(InnerQueuedObserver p0,Throwable p1){
       if (this.error.addThrowable(p1)) {
          if (this.errorMode == ErrorMode.IMMEDIATE) {
             this.d.dispose();
          }
          p0.setDone();
          this.drain();
       }else {
          a.l(p1);
       }
       return;
    }
    public void innerNext(InnerQueuedObserver p0,Object p1){
       p0.queue().offer(p1);
       this.drain();
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
          this.queue = new a(this.prefetch);
          this.actual.onSubscribe(this);
       }
       return;
    }
}
