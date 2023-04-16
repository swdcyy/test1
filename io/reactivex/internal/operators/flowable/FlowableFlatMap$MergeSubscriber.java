package io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber;
import cxd.c;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.lang.Object;
import java.lang.System;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import io.reactivex.internal.util.ExceptionHelper;
import ird.a;
import io.reactivex.internal.fuseable.n;
import drd.a;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import cxd.b;
import java.util.concurrent.Callable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.IllegalStateException;

public final class FlowableFlatMap$MergeSubscriber extends AtomicInteger implements k, d	// class@00122e
{
    public final c actual;
    public final int bufferSize;
    public boolean cancelled;
    public final boolean delayErrors;
    public boolean done;
    public final AtomicThrowable errs;
    public long lastId;
    public int lastIndex;
    public final o mapper;
    public final int maxConcurrency;
    public n queue;
    public final AtomicLong requested;
    public int scalarEmitted;
    public final int scalarLimit;
    public final AtomicReference subscribers;
    public long uniqueId;
    public d upstream;
    public static final FlowableFlatMap$InnerSubscriber[] CANCELLED;
    public static final FlowableFlatMap$InnerSubscriber[] EMPTY;
    public static final long serialVersionUID;

    static {
       FlowableFlatMap$InnerSubscriber[] innerSubscri = new FlowableFlatMap$InnerSubscriber[0];
       FlowableFlatMap$MergeSubscriber.EMPTY = innerSubscri;
       FlowableFlatMap$InnerSubscriber[] innerSubscri1 = new FlowableFlatMap$InnerSubscriber[0];
       FlowableFlatMap$MergeSubscriber.CANCELLED = innerSubscri1;
    }
    public void FlowableFlatMap$MergeSubscriber(c p0,o p1,boolean p2,int p3,int p4){
       super();
       this.errs = new AtomicThrowable();
       AtomicReference uAtomicRefer = new AtomicReference();
       this.subscribers = uAtomicRefer;
       this.requested = new AtomicLong();
       this.actual = p0;
       this.mapper = p1;
       this.delayErrors = p2;
       this.maxConcurrency = p3;
       this.bufferSize = p4;
       this.scalarLimit = Math.max(1, (p3 >> 1));
       uAtomicRefer.lazySet(FlowableFlatMap$MergeSubscriber.EMPTY);
    }
    public boolean addInner(FlowableFlatMap$InnerSubscriber p0){
       while (true) {
          FlowableFlatMap$InnerSubscriber[] innerSubscri = this.subscribers.get();
          if (innerSubscri == FlowableFlatMap$MergeSubscriber.CANCELLED) {
             p0.dispose();
             return false;
          }else {
             int len = innerSubscri.length;
             int i = len + 1;
             FlowableFlatMap$InnerSubscriber[] innerSubscri1 = new FlowableFlatMap$InnerSubscriber[i];
             System.arraycopy(innerSubscri, false, innerSubscri1, false, len);
             innerSubscri1[len] = p0;
             if (this.subscribers.compareAndSet(innerSubscri, innerSubscri1)) {
                break ;
             }
          }
       }
       return true;
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.upstream.cancel();
          this.disposeAll();
          if (!this.getAndIncrement()) {
             FlowableFlatMap$MergeSubscriber tqueue = this.queue;
             if (tqueue != null) {
                tqueue.clear();
             }
          }
       }
       return;
    }
    public boolean checkTerminate(){
       if (this.cancelled != null) {
          this.clearScalarQueue();
          return true;
       }else if(this.delayErrors == null && this.errs.get() != null){
          this.clearScalarQueue();
          Throwable throwable = this.errs.terminate();
          if (throwable != ExceptionHelper.a) {
             this.actual.onError(throwable);
          }
          return true;
       }else {
          return false;
       }
    }
    public void clearScalarQueue(){
       FlowableFlatMap$MergeSubscriber tqueue = this.queue;
       if (tqueue != null) {
          tqueue.clear();
       }
       return;
    }
    public void disposeAll(){
       FlowableFlatMap$InnerSubscriber[] cANCELLED = FlowableFlatMap$MergeSubscriber.CANCELLED;
       if (this.subscribers.get() != cANCELLED) {
          FlowableFlatMap$InnerSubscriber[] andSet = this.subscribers.getAndSet(cANCELLED);
          if (andSet != cANCELLED) {
             int len = andSet.length;
             for (int i = 0; i < len; i = i + 1) {
                andSet[i].dispose();
             }
             Throwable throwable = this.errs.terminate();
             if (throwable != null && throwable != ExceptionHelper.a) {
                a.l(throwable);
             }
          }
       }
       return;
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          this.drainLoop();
       }
       return;
    }
    public void drainLoop(){
       int b1;
       FlowableFlatMap$InnerSubscriber obj;
       int i2;
       FlowableFlatMap$InnerSubscriber[] innerSubscri1;
       int i3;
       object oobject1;
       long l4;
       FlowableFlatMap$MergeSubscriber mergeSubscri1;
       FlowableFlatMap$InnerSubscriber innerSubscri2;
       FlowableFlatMap$MergeSubscriber mergeSubscri = this;
       FlowableFlatMap$MergeSubscriber actual = mergeSubscri.actual;
       int i = 1;
       while (true) {
          if (this.checkTerminate()) {
             return;
          }
          FlowableFlatMap$MergeSubscriber queue = mergeSubscri.queue;
          long l = mergeSubscri.requested.get();
          int i1 = (!l - Long.MAX_VALUE)? 1: 0;
          boolean b = true;
          long l1 = 0;
          long l2 = l1;
          if (queue != null) {
             while (true) {
                long l3 = l1;
                b1 = false;
                break ;
             }
             while (true) {
                if (l - l1) {
                   obj = queue.poll();
                   if (this.checkTerminate()) {
                      return;
                   }else if(obj == null){
                      b1 = obj;
                   label_0049 :
                      if (l3 - l1) {
                         if (i1) {
                            l = Long.MAX_VALUE;
                         }else {
                            long l6 = - l3;
                            l = mergeSubscri.requested.addAndGet(l6);
                         }
                      }
                      if (l - l1 && b1 != null) {
                         l3 = Long.MAX_VALUE;
                      }
                   }else {
                      actual.onNext(obj);
                      l2 = l2 + b;
                      l3 = l3 + b;
                      l = l - b;
                      b1 = obj;
                   }
                }else {
                   goto label_0049 ;
                }
             }
          }
          FlowableFlatMap$MergeSubscriber queue1 = mergeSubscri.queue;
          FlowableFlatMap$InnerSubscriber[] innerSubscri = mergeSubscri.subscribers.get();
          boolean len = innerSubscri.length;
          if (mergeSubscri.done != null && (queue1 == null || (queue1.isEmpty() && !len))) {
             Throwable throwable = mergeSubscri.errs.terminate();
             if (throwable != ExceptionHelper.a) {
                if (throwable == null) {
                   actual.onComplete();
                   break ;
                }else {
                   actual.onError(throwable);
                   break ;
                }
             }
             break ;
          }else {
             b1 = i;
             if (len) {
                FlowableFlatMap$MergeSubscriber lastId = mergeSubscri.lastId;
                queue = mergeSubscri.lastIndex;
                if (len <= queue || innerSubscri[queue].id - lastId) {
                   if (len <= queue) {
                      i2 = 0;
                   }
                   boolean b2 = false;
                   while (b2 < len && innerSubscri[i2].id - lastId) {
                      i2 = i2 + 1;
                      if (i2 == len) {
                         i2 = 0;
                      }
                      b2 = b2 + 1;
                   }
                   mergeSubscri.lastIndex = i2;
                   mergeSubscri.lastId = innerSubscri[i2].id;
                }
                lastId = i2;
                i2 = false;
                i = 0;
                while (true) {
                   if (i < len) {
                      if (this.checkTerminate()) {
                         return;
                      }else {
                         object oobject = innerSubscri[lastId];
                         FlowableFlatMap$InnerSubscriber obj1 = null;
                         while (true) {
                            if (this.checkTerminate()) {
                               return;
                            }
                            FlowableFlatMap$InnerSubscriber queue2 = oobject.queue;
                            if (queue2 == null) {
                               innerSubscri1 = innerSubscri;
                               i3 = len;
                            }else {
                               innerSubscri1 = innerSubscri;
                               i3 = len;
                               long l5 = l1;
                               while (true) {
                                  if (l - l1) {
                                     obj1 = queue2.poll();
                                     if (obj1 == null) {
                                     label_012e :
                                        if (l5 - l1) {
                                           if (!i1) {
                                              l1 = - l5;
                                              l = mergeSubscri.requested.addAndGet(l1);
                                           }else {
                                              mergeSubscri1 = Long.MAX_VALUE;
                                           }
                                           oobject.requestMore(l5);
                                           innerSubscri2 = null;
                                        }else {
                                           innerSubscri2 = l1;
                                        }
                                        if (l - innerSubscri2 && obj1 != null) {
                                           innerSubscri = innerSubscri1;
                                           len = i3;
                                           l1 = 0;
                                        }
                                     }else {
                                        actual.onNext(obj1);
                                        if (this.checkTerminate()) {
                                           return;
                                        }else {
                                           l = l - 1;
                                           l5 = l5 + 1;
                                        }
                                     }
                                  }else {
                                     goto label_012e ;
                                  }
                               }
                               return;
                            }
                            obj = oobject.queue;
                            if (oobject.done != null && (obj == null || obj.isEmpty())) {
                               mergeSubscri.removeInner(oobject);
                               if (this.checkTerminate()) {
                                  return;
                               }else {
                                  l2 = l2 + 1;
                                  oobject1 = 1;
                               }
                            }else {
                               queue1 = 1;
                            }
                            if (!l) {
                               len = oobject1;
                               obj1 = 1;
                            label_018f :
                               mergeSubscri.lastIndex = lastId;
                               mergeSubscri.lastId = innerSubscri1[lastId].id;
                               l4 = l2;
                               mergeSubscri1 = null;
                            }else {
                               int i4 = lastId + 1;
                               len = i3;
                               if (i4 == len) {
                                  i4 = 0;
                               }
                               i = i + 1;
                               innerSubscri = innerSubscri1;
                               l1 = 0;
                            }
                         }
                      }
                   }else {
                      innerSubscri1 = innerSubscri;
                      len = i2;
                      goto label_018f ;
                   }
                }
             }else {
                mergeSubscri1 = l1;
                l4 = l2;
                len = false;
             }
             if (l4 - mergeSubscri1 && mergeSubscri.cancelled == null) {
                mergeSubscri.upstream.request(l4);
             }
             if (len) {
                i = b1;
             }else {
                i2 = - b1;
                i = mergeSubscri.addAndGet(i2);
                if (!i) {
                   return;
                }else {
                   continue ;
                }
             }
          }
       }
    }
    public o getInnerQueue(FlowableFlatMap$InnerSubscriber p0){
       FlowableFlatMap$InnerSubscriber queue = p0.queue;
       if (queue == null) {
          queue = new SpscArrayQueue(this.bufferSize);
          p0.queue = queue;
       }
       return queue;
    }
    public o getMainQueue(){
       FlowableFlatMap$MergeSubscriber tqueue = this.queue;
       if (tqueue == null) {
          tqueue = (this.maxConcurrency == Integer.MAX_VALUE)? new a(this.bufferSize): new SpscArrayQueue(this.maxConcurrency);
          this.queue = tqueue;
       }
       return tqueue;
    }
    public void innerError(FlowableFlatMap$InnerSubscriber p0,Throwable p1){
       if (this.errs.addThrowable(p1)) {
          p0.done = true;
          if (this.delayErrors == null) {
             this.upstream.cancel();
             FlowableFlatMap$InnerSubscriber[] andSet = this.subscribers.getAndSet(FlowableFlatMap$MergeSubscriber.CANCELLED);
             int len = andSet.length;
             for (int i = 0; i < len; i = i + 1) {
                andSet[i].dispose();
             }
          }
          this.drain();
       }else {
          a.l(p1);
       }
       return;
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
       }else if(this.errs.addThrowable(p0)){
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
       a.c(p0, "The mapper returned a null Publisher");
       if (p0 instanceof Callable) {
          p0 = p0.call();
          if (p0 != null) {
             this.tryEmitScalar(p0);
          }else if(this.maxConcurrency != Integer.MAX_VALUE && this.cancelled == null){
             int i = this.scalarEmitted + 1;
             this.scalarEmitted = i;
             FlowableFlatMap$MergeSubscriber tscalarLimit = this.scalarLimit;
             if (i == tscalarLimit) {
                this.scalarEmitted = 0;
                this.upstream.request((long)tscalarLimit);
             }
          }
       }else {
          FlowableFlatMap$MergeSubscriber tuniqueId = this.uniqueId;
          this.uniqueId = 1 + tuniqueId;
          FlowableFlatMap$InnerSubscriber innerSubscri = new FlowableFlatMap$InnerSubscriber(this, tuniqueId);
          if (this.addInner(innerSubscri)) {
             p0.subscribe(innerSubscri);
          }
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.actual.onSubscribe(this);
          if (this.cancelled == null) {
             FlowableFlatMap$MergeSubscriber tmaxConcurre = this.maxConcurrency;
             if (tmaxConcurre == Integer.MAX_VALUE) {
                p0.request(Long.MAX_VALUE);
             }else {
                p0.request((long)tmaxConcurre);
             }
          }
       }
       return;
    }
    public void removeInner(FlowableFlatMap$InnerSubscriber p0){
       FlowableFlatMap$InnerSubscriber[] eMPTY;
       while (true) {
          FlowableFlatMap$InnerSubscriber[] innerSubscri = this.subscribers.get();
          int len = innerSubscri.length;
          if (!len) {
             return;
          }
          FlowableFlatMap$MergeSubscriber mergeSubscri = -1;
          int i = 0;
          int i1 = 0;
          while (i1 < len) {
             if (innerSubscri[i1] == p0) {
                mergeSubscri = i1;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          if (mergeSubscri < 0) {
             return;
          }
          i1 = 1;
          if (len == i1) {
             eMPTY = FlowableFlatMap$MergeSubscriber.EMPTY;
          }else {
             int i2 = len - 1;
             FlowableFlatMap$InnerSubscriber[] innerSubscri1 = new FlowableFlatMap$InnerSubscriber[i2];
             System.arraycopy(innerSubscri, i, innerSubscri1, i, mergeSubscri);
             i = mergeSubscri + 1;
             len = len - mergeSubscri;
             len = len - i1;
             System.arraycopy(innerSubscri, i, innerSubscri1, mergeSubscri, len);
             eMPTY = innerSubscri1;
          }
          if (this.subscribers.compareAndSet(innerSubscri, eMPTY)) {
          }
       }
       return;
    }
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.drain();
       }
       return;
    }
    public void tryEmit(Object p0,FlowableFlatMap$InnerSubscriber p1){
       FlowableFlatMap$InnerSubscriber queue;
       SpscArrayQueue spscArrayQue;
       if (!this.get() && this.compareAndSet(0, 1)) {
          long l = this.requested.get();
          queue = p1.queue;
          if (l - false && (queue == null || queue.isEmpty())) {
             this.actual.onNext(p0);
             if (l - Long.MAX_VALUE) {
                this.requested.decrementAndGet();
             }
             p1.requestMore(1);
          }else if(queue == null){
             queue = this.getInnerQueue(p1);
          }
          if (!queue.offer(p0)) {
             this.onError(new MissingBackpressureException("Inner queue full?!"));
             return;
          }
          if (!this.decrementAndGet()) {
             return;
          }
       }else {
          queue = p1.queue;
          if (queue == null) {
             spscArrayQue = new SpscArrayQueue(this.bufferSize);
             p1.queue = spscArrayQue;
          }
          if (!spscArrayQue.offer(p0)) {
             this.onError(new MissingBackpressureException("Inner queue full?!"));
             return;
          }else if(this.getAndIncrement()){
             return;
          }
       }
       this.drainLoop();
       return;
    }
    public void tryEmitScalar(Object p0){
       String str = "Scalar queue full?!";
       if (!this.get()) {
          int i = 0;
          if (this.compareAndSet(i, 1)) {
             long l = this.requested.get();
             FlowableFlatMap$MergeSubscriber tqueue = this.queue;
             if (l - false && (tqueue == null || tqueue.isEmpty())) {
                this.actual.onNext(p0);
                if (l - Long.MAX_VALUE) {
                   this.requested.decrementAndGet();
                }
                if (this.maxConcurrency != Integer.MAX_VALUE && this.cancelled == null) {
                   int i1 = this.scalarEmitted + 1;
                   this.scalarEmitted = i1;
                   FlowableFlatMap$MergeSubscriber tscalarLimit = this.scalarLimit;
                   if (i1 == tscalarLimit) {
                      this.scalarEmitted = i;
                      this.upstream.request((long)tscalarLimit);
                   }
                }
             }else if(tqueue == null){
                tqueue = this.getMainQueue();
             }
             if (!tqueue.offer(p0)) {
                this.onError(new IllegalStateException(str));
                return;
             }
          label_006b :
             if (!this.decrementAndGet()) {
                return;
             }else {
             label_008c :
                this.drainLoop();
                return;
             }
          }
       }
       if (!this.getMainQueue().offer(p0)) {
          this.onError(new IllegalStateException(str));
          return;
       }else if(this.getAndIncrement()){
          return;
       }else {
          goto label_008c ;
       }
    }
}
