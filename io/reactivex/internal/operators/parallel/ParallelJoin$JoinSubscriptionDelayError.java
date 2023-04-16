package io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionDelayError;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase;
import cxd.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber;
import java.lang.Object;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.fuseable.o;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;

public final class ParallelJoin$JoinSubscriptionDelayError extends ParallelJoin$JoinSubscriptionBase	// class@00144b
{
    public static final long serialVersionUID = 0xb05ea70e2bbbd725;

    public void ParallelJoin$JoinSubscriptionDelayError(c p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       this.drainLoop();
       return;
    }
    public void drainLoop(){
       object oobject;
       object oobject1;
       ParallelJoin$JoinInnerSubscriber queue;
       int i5;
       ParallelJoin$JoinSubscriptionBase joinSubscrip = this;
       ParallelJoin$JoinSubscriptionBase subscribers = joinSubscrip.subscribers;
       int len = subscribers.length;
       ParallelJoin$JoinSubscriptionBase actual = joinSubscrip.actual;
       int i = 1;
       while (true) {
          long l = joinSubscrip.requested.get();
          int i1 = 0;
          long l1 = i1;
          break ;
       }
       while (true) {
          if (l1 - l) {
             if (joinSubscrip.cancelled != null) {
                this.cleanup();
                return;
             }else if(!joinSubscrip.done.get()){
                oobject = 1;
             }else {
                oobject = null;
             }
             int i2 = 0;
             int i3 = 1;
             while (true) {
                if (i2 < len) {
                   oobject1 = subscribers[i2];
                   queue = oobject1.queue;
                   if (queue != null) {
                      Object obj = queue.poll();
                      if (obj != null) {
                         actual.onNext(obj);
                         oobject1.requestOne();
                         l1 = l1 + 1;
                         if (l1 - l) {
                            i3 = 0;
                         }
                      }
                   }
                   i2 = i2 + 1;
                }else if(oobject != null && i3){
                   if (joinSubscrip.errors.get() != null) {
                      actual.onError(joinSubscrip.errors.terminate());
                   }else {
                      actual.onComplete();
                   }
                }else {
                   if (!i3) {
                      continue ;
                   }
                }
             }
          }
          if (!l1 - l) {
             if (joinSubscrip.cancelled != null) {
                this.cleanup();
                return;
             }else if(!joinSubscrip.done.get()){
                oobject1 = 1;
             }else {
                i5 = 0;
             }
             int i4 = 0;
             while (true) {
                if (i4 < len) {
                   ParallelJoin$JoinInnerSubscriber queue1 = subscribers[i4].queue;
                   if (queue1 != null && !queue1.isEmpty()) {
                      queue = null;
                   label_0095 :
                      if (oobject1 && queue) {
                         if (joinSubscrip.errors.get() != null) {
                            actual.onError(joinSubscrip.errors.terminate());
                            break ;
                         }else {
                            actual.onComplete();
                            break ;
                         }
                      }
                   }else {
                      i4 = i4 + 1;
                   }
                }else {
                   queue = 1;
                   goto label_0095 ;
                }
             }
             return;
          }
          if (l1 - i1 && l - Long.MAX_VALUE) {
             l = - l1;
             joinSubscrip.requested.addAndGet(l);
          }
          i5 = this.get();
          if (i5 == i) {
             i5 = - i;
             i5 = joinSubscrip.addAndGet(i5);
             if (!i5) {
                return;
             }
          }
          i = i5;
       }
       return;
    }
    public void onComplete(){
       this.done.decrementAndGet();
       this.drain();
    }
    public void onError(Throwable p0){
       this.errors.addThrowable(p0);
       this.done.decrementAndGet();
       this.drain();
    }
    public void onNext(ParallelJoin$JoinInnerSubscriber p0,Object p1){
       if (!this.get() && this.compareAndSet(0, 1)) {
          if (this.requested.get()) {
             this.actual.onNext(p1);
             if (this.requested.get() - Long.MAX_VALUE) {
                this.requested.decrementAndGet();
             }
             p0.request(1);
          }else if(!p0.getQueue().offer(p1)){
             p0.cancel();
             this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
             this.done.decrementAndGet();
             this.drainLoop();
             return;
          }
          if (!this.decrementAndGet()) {
             return;
          }
       }else if(!p0.getQueue().offer(p1) && p0.cancel()){
          this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
          this.done.decrementAndGet();
       }
       if (this.getAndIncrement()) {
          return;
       }
       this.drainLoop();
       return;
    }
}
