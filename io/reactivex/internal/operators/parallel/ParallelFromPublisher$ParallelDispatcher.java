package io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher;
import brd.k;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import java.util.concurrent.atomic.AtomicLongArray;
import cxd.d;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import java.lang.Object;
import drd.a;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.fuseable.l;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher$a;

public final class ParallelFromPublisher$ParallelDispatcher extends AtomicInteger implements k	// class@001446
{
    public boolean cancelled;
    public boolean done;
    public final long[] emissions;
    public Throwable error;
    public int index;
    public final int limit;
    public final int prefetch;
    public int produced;
    public o queue;
    public final AtomicLongArray requests;
    public d s;
    public int sourceMode;
    public final AtomicInteger subscriberCount;
    public final c[] subscribers;
    public static final long serialVersionUID = 0xc1f51e0c5f2f71a7;

    public void ParallelFromPublisher$ParallelDispatcher(c[] p0,int p1){
       super();
       this.subscriberCount = new AtomicInteger();
       this.subscribers = p0;
       this.prefetch = p1;
       this.limit = p1 - (p1 >> 2);
       int len = p0.length;
       int i = len + len;
       AtomicLongArray uAtomicLongA = new AtomicLongArray((i + 1));
       this.requests = uAtomicLongA;
       uAtomicLongA.lazySet(i, (long)len);
       long[] olongArray = new long[len];
       this.emissions = olongArray;
    }
    public void cancel(int p0){
       if (!this.requests.decrementAndGet(p0)) {
          this.cancelled = true;
          this.s.cancel();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       if (this.sourceMode == 1) {
          this.drainSync();
       }else {
          this.drainAsync();
       }
       return;
    }
    public void drainAsync(){
       int len1;
       ParallelFromPublisher$ParallelDispatcher parallelDisp = this;
       ParallelFromPublisher$ParallelDispatcher queue = parallelDisp.queue;
       ParallelFromPublisher$ParallelDispatcher subscribers = parallelDisp.subscribers;
       ParallelFromPublisher$ParallelDispatcher requests = parallelDisp.requests;
       ParallelFromPublisher$ParallelDispatcher emissions = parallelDisp.emissions;
       int len = emissions.length;
       ParallelFromPublisher$ParallelDispatcher index = parallelDisp.index;
       ParallelFromPublisher$ParallelDispatcher produced = parallelDisp.produced;
       int i = 1;
       do {
          int i1 = 0;
          Object obj = null;
          while (true) {
             if (parallelDisp.cancelled != null) {
                queue.clear();
                return;
             }else {
                ParallelFromPublisher$ParallelDispatcher done = parallelDisp.done;
                if (done != null) {
                   ParallelFromPublisher$ParallelDispatcher error = parallelDisp.error;
                   if (error != null) {
                      queue.clear();
                      len1 = subscribers.length;
                      for (; i1 < len1; i1 = i1 + 1) {
                         subscribers[i1].onError(error);
                      }
                      return;
                   }
                }
                boolean b = queue.isEmpty();
                if (done != null && b) {
                   len1 = subscribers.length;
                   for (; i1 < len1; i1 = i1 + 1) {
                      subscribers[i1].onComplete();
                   }
                   return;
                }else if(b){
                   long l = emissions[index];
                   if (requests.get(index) - l) {
                      int i2 = len + index;
                      if (!requests.get(i2)) {
                         obj = queue.poll();
                         if (obj != null) {
                            subscribers[index].onNext(obj);
                            l = l + 1;
                            emissions[index] = l;
                            produced = produced + 1;
                            if (produced == parallelDisp.limit) {
                               parallelDisp.s.request((long)produced);
                               produced = 0;
                            }
                            obj = 0;
                         label_0096 :
                            index = index + 1;
                            if (index == len) {
                               index = 0;
                            }
                            if (obj != len) {
                            }
                         }
                      }
                   }
                   int i3 = obj + 1;
                   goto label_0096 ;
                }
             label_009d :
                i1 = this.get();
                if (i1 == i) {
                   parallelDisp.index = index;
                   parallelDisp.produced = produced;
                   i = - i;
                   i = parallelDisp.addAndGet(i);
                   if (!i) {
                      break ;
                   }else {
                      continue ;
                   }
                }else {
                   i = i1;
                   continue ;
                }
             }
          }
          return;
       } while (!i);
    }
    public void drainSync(){
       int len1;
       ParallelFromPublisher$ParallelDispatcher parallelDisp = this;
       ParallelFromPublisher$ParallelDispatcher queue = parallelDisp.queue;
       ParallelFromPublisher$ParallelDispatcher subscribers = parallelDisp.subscribers;
       ParallelFromPublisher$ParallelDispatcher requests = parallelDisp.requests;
       ParallelFromPublisher$ParallelDispatcher emissions = parallelDisp.emissions;
       int len = emissions.length;
       ParallelFromPublisher$ParallelDispatcher index = parallelDisp.index;
       int i = 1;
       do {
          int i1 = 0;
          Object obj = null;
          while (true) {
             if (parallelDisp.cancelled != null) {
                queue.clear();
                return;
             }else if(queue.isEmpty()){
                len1 = subscribers.length;
                for (; i1 < len1; i1 = i1 + 1) {
                   subscribers[i1].onComplete();
                }
                return;
             }else {
                long l = emissions[index];
                if (requests.get(index) - l) {
                   int i2 = len + index;
                   if (!requests.get(i2)) {
                      obj = queue.poll();
                      if (obj == null) {
                         len1 = subscribers.length;
                         for (; i1 < len1; i1 = i1 + 1) {
                            subscribers[i1].onComplete();
                         }
                         return;
                      }else {
                         subscribers[index].onNext(obj);
                         l = l + 1;
                         emissions[index] = l;
                         obj = 0;
                      label_0076 :
                         index = index + 1;
                         if (index == len) {
                            index = 0;
                         }
                         if (obj == len) {
                            i1 = this.get();
                            if (i1 == i) {
                               parallelDisp.index = index;
                               i = - i;
                               i = parallelDisp.addAndGet(i);
                               if (!i) {
                                  break ;
                               }else {
                                  continue ;
                               }
                            }else {
                               i = i1;
                               continue ;
                            }
                         }
                      }
                   }
                }
                int i3 = obj + 1;
                goto label_0076 ;
             }
          }
          return;
       } while (!i);
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
       if (this.sourceMode == null && !this.queue.offer(p0)) {
          this.s.cancel();
          this.onError(new MissingBackpressureException("Queue is full?"));
          return;
       }else {
          this.drain();
          return;
       }
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          if (p0 instanceof l) {
             k ok = p0;
             int i = ok.requestFusion(7);
             boolean b = true;
             if (i == b) {
                this.sourceMode = i;
                this.queue = ok;
                this.done = b;
                this.setupSubscribers();
                this.drain();
                return;
             }else if(i == 2){
                this.sourceMode = i;
                this.queue = ok;
                this.setupSubscribers();
                p0.request((long)this.prefetch);
                return;
             }
          }
          this.queue = new SpscArrayQueue(this.prefetch);
          this.setupSubscribers();
          p0.request((long)this.prefetch);
       }
       return;
    }
    public void setupSubscribers(){
       ParallelFromPublisher$ParallelDispatcher tsubscribers = this.subscribers;
       int len = tsubscribers.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          if (this.cancelled != null) {
             break ;
          }else {
             int i1 = i + 1;
             this.subscriberCount.lazySet(i1);
             tsubscribers[i].onSubscribe(new ParallelFromPublisher$ParallelDispatcher$a(this, i, len));
             i = i1;
          }
       }
       return;
    }
}
