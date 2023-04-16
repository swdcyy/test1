package io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver;
import crd.b;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.System;
import java.lang.Throwable;
import io.reactivex.internal.util.ExceptionHelper;
import ird.a;
import io.reactivex.internal.fuseable.n;
import java.util.Queue;
import io.reactivex.internal.fuseable.o;
import drd.a;
import brd.w;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.lang.IllegalStateException;

public final class ObservableFlatMap$MergeObserver extends AtomicInteger implements b, y	// class@001893
{
    public final y actual;
    public final int bufferSize;
    public boolean cancelled;
    public final boolean delayErrors;
    public boolean done;
    public final AtomicThrowable errors;
    public long lastId;
    public int lastIndex;
    public final o mapper;
    public final int maxConcurrency;
    public final AtomicReference observers;
    public n queue;
    public b s;
    public Queue sources;
    public long uniqueId;
    public int wip;
    public static final ObservableFlatMap$InnerObserver[] CANCELLED;
    public static final ObservableFlatMap$InnerObserver[] EMPTY;
    public static final long serialVersionUID;

    static {
       ObservableFlatMap$InnerObserver[] innerObserve = new ObservableFlatMap$InnerObserver[0];
       ObservableFlatMap$MergeObserver.EMPTY = innerObserve;
       ObservableFlatMap$InnerObserver[] innerObserve1 = new ObservableFlatMap$InnerObserver[0];
       ObservableFlatMap$MergeObserver.CANCELLED = innerObserve1;
    }
    public void ObservableFlatMap$MergeObserver(y p0,o p1,boolean p2,int p3,int p4){
       super();
       this.errors = new AtomicThrowable();
       this.actual = p0;
       this.mapper = p1;
       this.delayErrors = p2;
       this.maxConcurrency = p3;
       this.bufferSize = p4;
       if (p3 != Integer.MAX_VALUE) {
          this.sources = new ArrayDeque(p3);
       }
       this.observers = new AtomicReference(ObservableFlatMap$MergeObserver.EMPTY);
       return;
    }
    public boolean addInner(ObservableFlatMap$InnerObserver p0){
       while (true) {
          ObservableFlatMap$InnerObserver[] innerObserve = this.observers.get();
          if (innerObserve == ObservableFlatMap$MergeObserver.CANCELLED) {
             p0.dispose();
             return false;
          }else {
             int len = innerObserve.length;
             int i = len + 1;
             ObservableFlatMap$InnerObserver[] innerObserve1 = new ObservableFlatMap$InnerObserver[i];
             System.arraycopy(innerObserve, false, innerObserve1, false, len);
             innerObserve1[len] = p0;
             if (this.observers.compareAndSet(innerObserve, innerObserve1)) {
                break ;
             }
          }
       }
       return true;
    }
    public boolean checkTerminate(){
       if (this.cancelled != null) {
          return true;
       }
       Throwable throwable = this.errors.get();
       if (this.delayErrors != null || throwable == null) {
          return false;
       }
       this.disposeAll();
       throwable = this.errors.terminate();
       if (throwable != ExceptionHelper.a) {
          this.actual.onError(throwable);
       }
       return true;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          if (this.disposeAll()) {
             Throwable throwable = this.errors.terminate();
             if (throwable != null && throwable != ExceptionHelper.a) {
                a.l(throwable);
             }
          }
       }
       return;
    }
    public boolean disposeAll(){
       this.s.dispose();
       ObservableFlatMap$InnerObserver[] cANCELLED = ObservableFlatMap$MergeObserver.CANCELLED;
       int i = 0;
       if (this.observers.get() != cANCELLED) {
          ObservableFlatMap$InnerObserver[] andSet = this.observers.getAndSet(cANCELLED);
          if (andSet != cANCELLED) {
             int len = andSet.length;
             for (; i < len; i = i + 1) {
                andSet[i].dispose();
             }
             return true;
          }
       }
       return i;
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          this.drainLoop();
       }
       return;
    }
    public void drainLoop(){
       ObservableFlatMap$MergeObserver obj;
       int i1;
       int i2;
       ObservableFlatMap$MergeObserver tactual = this.actual;
       ObservableFlatMap$MergeObserver mergeObserve = 1;
       Throwable throwable = 1;
       while (true) {
          if (this.checkTerminate()) {
             return;
          }
          ObservableFlatMap$MergeObserver tqueue = this.queue;
          if (tqueue != null) {
             while (true) {
                if (this.checkTerminate()) {
                   return;
                }
                obj = tqueue.poll();
                if (obj == null) {
                   if (obj != null) {
                   }
                }else {
                   tactual.onNext(obj);
                }
             }
          }
          tqueue = this.done;
          obj = this.queue;
          ObservableFlatMap$InnerObserver[] innerObserve = this.observers.get();
          int len = innerObserve.length;
          int i = 0;
          if (this.maxConcurrency != Integer.MAX_VALUE) {
             _monitor_enter(this);
             i1 = this.sources.size();
             _monitor_exit(this);
          }else {
             i1 = 0;
          }
          if (tqueue != null && (obj == null || (obj.isEmpty() && (!len && !i1)))) {
             Throwable throwable1 = this.errors.terminate();
             if (throwable1 != ExceptionHelper.a) {
                if (throwable1 == null) {
                   tactual.onComplete();
                   break ;
                }else {
                   tactual.onError(throwable1);
                   break ;
                }
             }
             break ;
          }else if(len){
             tqueue = this.lastId;
             ObservableFlatMap$MergeObserver tlastIndex = this.lastIndex;
             if (len <= tlastIndex || innerObserve[tlastIndex].id - tqueue) {
                if (len <= tlastIndex) {
                   tlastIndex = 0;
                }
                boolean b = false;
                while (b < len && innerObserve[tlastIndex].id - tqueue) {
                   tlastIndex = tlastIndex + 1;
                   if (tlastIndex == len) {
                      tlastIndex = 0;
                   }
                   b = b + 1;
                }
                this.lastIndex = tlastIndex;
                this.lastId = innerObserve[tlastIndex].id;
             }
             i2 = 0;
             boolean b1 = false;
             while (true) {
                if (i2 < len) {
                   if (this.checkTerminate()) {
                      return;
                   }else {
                      object oobject = innerObserve[tlastIndex];
                      while (true) {
                         if (this.checkTerminate()) {
                            return;
                         }
                         ObservableFlatMap$InnerObserver queue = oobject.queue;
                         if (queue != null) {
                            while (true) {
                               Object obj1 = queue.poll();
                               if (obj1 == null) {
                                  if (obj1 != null) {
                                  }
                               }else {
                                  tactual.onNext(obj1);
                                  if (this.checkTerminate()) {
                                     return;
                                  }
                                  continue ;
                               }
                            }
                            return;
                         }
                         ObservableFlatMap$InnerObserver queue1 = oobject.queue;
                         if (oobject.done != null && (queue1 == null || queue1.isEmpty())) {
                            this.removeInner(oobject);
                            if (this.checkTerminate()) {
                               return;
                            }else {
                               b1 = true;
                            }
                         }
                         tlastIndex = tlastIndex + 1;
                         if (tlastIndex == len) {
                            tlastIndex = 0;
                         }
                         i2 = i2 + mergeObserve;
                      }
                   }
                }else {
                   this.lastIndex = tlastIndex;
                   this.lastId = innerObserve[tlastIndex].id;
                   i = b1;
                }
             }
          }
          if (i) {
             if (this.maxConcurrency != Integer.MAX_VALUE) {
                _monitor_enter(this);
                w ow = this.sources.poll();
                if (ow == null) {
                   i2 = this.wip - mergeObserve;
                   this.wip = i2;
                   _monitor_exit(this);
                }else {
                   _monitor_exit(this);
                   this.subscribeInner(ow);
                   continue ;
                }
             }else {
                continue ;
             }
          }else {
             int i3 = - throwable;
             if (!this.addAndGet(i3)) {
                return;
             }else {
                continue ;
             }
          }
       }
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.drain();
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else if(this.errors.addThrowable(p0)){
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null ObservableSource");
       if (this.maxConcurrency != Integer.MAX_VALUE) {
          _monitor_enter(this);
          ObservableFlatMap$MergeObserver twip = this.wip;
          if (twip == this.maxConcurrency) {
             this.sources.offer(p0);
             _monitor_exit(this);
             return;
          }else {
             this.wip = twip + 1;
             _monitor_exit(this);
          }
       }
       this.subscribeInner(p0);
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void removeInner(ObservableFlatMap$InnerObserver p0){
       ObservableFlatMap$InnerObserver[] eMPTY;
       while (true) {
          ObservableFlatMap$InnerObserver[] innerObserve = this.observers.get();
          int len = innerObserve.length;
          if (!len) {
             return;
          }
          ObservableFlatMap$MergeObserver mergeObserve = -1;
          int i = 0;
          int i1 = 0;
          while (i1 < len) {
             if (innerObserve[i1] == p0) {
                mergeObserve = i1;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          if (mergeObserve < 0) {
             return;
          }
          i1 = 1;
          if (len == i1) {
             eMPTY = ObservableFlatMap$MergeObserver.EMPTY;
          }else {
             int i2 = len - 1;
             ObservableFlatMap$InnerObserver[] innerObserve1 = new ObservableFlatMap$InnerObserver[i2];
             System.arraycopy(innerObserve, i, innerObserve1, i, mergeObserve);
             i = mergeObserve + 1;
             len = len - mergeObserve;
             len = len - i1;
             System.arraycopy(innerObserve, i, innerObserve1, mergeObserve, len);
             eMPTY = innerObserve1;
          }
          if (this.observers.compareAndSet(innerObserve, eMPTY)) {
          }
       }
       return;
    }
    public void subscribeInner(w p0){
       while (true) {
          if (p0 instanceof Callable) {
             if (this.tryEmitScalar(p0) && this.maxConcurrency != Integer.MAX_VALUE) {
                ObservableFlatMap$MergeObserver mergeObserve = null;
                _monitor_enter(this);
                w ow = this.sources.poll();
                int i = 1;
                if (ow == null) {
                   int i1 = this.wip - i;
                   this.wip = i1;
                   mergeObserve = 1;
                }
                _monitor_exit(this);
                if (mergeObserve != null) {
                   this.drain();
                   break ;
                }else {
                   mergeObserve = ow;
                }
             }else {
                break ;
             }
          }else {
             ObservableFlatMap$MergeObserver tuniqueId = this.uniqueId;
             this.uniqueId = 1 + tuniqueId;
             ObservableFlatMap$InnerObserver innerObserve = new ObservableFlatMap$InnerObserver(this, tuniqueId);
             if (this.addInner(innerObserve)) {
                p0.subscribe(innerObserve);
                break ;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public void tryEmit(Object p0,ObservableFlatMap$InnerObserver p1){
       if (!this.get() && this.compareAndSet(0, 1)) {
          this.actual.onNext(p0);
          if (!this.decrementAndGet()) {
             return;
          }
       }else {
          ObservableFlatMap$InnerObserver queue = p1.queue;
          if (queue == null) {
             queue = new a(this.bufferSize);
             p1.queue = queue;
          }
          queue.offer(p0);
          if (this.getAndIncrement()) {
             return;
          }
       }
       this.drainLoop();
       return;
    }
    public boolean tryEmitScalar(Callable p0){
       p0 = p0.call();
       if (p0 == null) {
          return true;
       }
       if (!this.get() && this.compareAndSet(0, true)) {
          this.actual.onNext(p0);
          if (!this.decrementAndGet()) {
             return true;
          }
       }else {
          ObservableFlatMap$MergeObserver tqueue = this.queue;
          if (tqueue == null) {
             tqueue = (this.maxConcurrency == Integer.MAX_VALUE)? new a(this.bufferSize): new SpscArrayQueue(this.maxConcurrency);
             this.queue = tqueue;
          }
          if (!tqueue.offer(p0)) {
             this.onError(new IllegalStateException("Scalar queue full?!"));
             return true;
          }else if(this.getAndIncrement()){
             return 0;
          }
       }
       this.drainLoop();
       return true;
    }
}
