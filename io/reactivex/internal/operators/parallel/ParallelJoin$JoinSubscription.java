package io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscription;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase;
import cxd.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber;
import io.reactivex.internal.fuseable.n;
import io.reactivex.internal.fuseable.o;
import ird.a;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;

public final class ParallelJoin$JoinSubscription extends ParallelJoin$JoinSubscriptionBase	// class@001449
{
    public static final long serialVersionUID = 0x579a0f4f7e6bd483;

    public void ParallelJoin$JoinSubscription(c p0,int p1,int p2){
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
             }else {
                Throwable throwable = joinSubscrip.errors.get();
                if (throwable != null) {
                   this.cleanup();
                   actual.onError(throwable);
                   return;
                }else if(!joinSubscrip.done.get()){
                   oobject = 1;
                }else {
                   oobject = null;
                }
                int i2 = 0;
                int i3 = 1;
                while (true) {
                   if (i2 < subscribers.length) {
                      object oobject1 = subscribers[i2];
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
                   }else {
                      if (!i3) {
                         continue ;
                      }
                   }
                }
                this.cleanup();
                return;
             }
          }
          if (!l1 - l) {
             if (joinSubscrip.cancelled != null) {
                this.cleanup();
                return;
             }else {
                Throwable throwable1 = joinSubscrip.errors.get();
                if (throwable1 != null) {
                   this.cleanup();
                   actual.onError(throwable1);
                   return;
                }else if(!joinSubscrip.done.get()){
                   throwable1 = 1;
                }else {
                   i5 = 0;
                }
                int i4 = 0;
                while (true) {
                   if (i4 < len) {
                      ParallelJoin$JoinInnerSubscriber queue1 = subscribers[i4].queue;
                      if (queue1 != null && !queue1.isEmpty()) {
                         queue = null;
                      label_00a4 :
                         if (throwable1 && queue) {
                            actual.onComplete();
                            return;
                         }
                      }else {
                         i4 = i4 + 1;
                      }
                   }else {
                      queue = 1;
                      goto label_00a4 ;
                   }
                }
             }
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
       actual.onComplete();
       return;
    }
    public void onComplete(){
       this.done.decrementAndGet();
       this.drain();
    }
    public void onError(Throwable p0){
       if (this.errors.compareAndSet(null, p0)) {
          this.cancelAll();
          this.drain();
       }else if(p0 != this.errors.get()){
          a.l(p0);
       }
       return;
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
             this.cancelAll();
             MissingBackpressureException missingBackp = new MissingBackpressureException("Queue full?!");
             if (this.errors.compareAndSet(null, missingBackp)) {
                this.actual.onError(missingBackp);
             }else {
                a.l(missingBackp);
             }
             return;
          }
          if (!this.decrementAndGet()) {
             return;
          }
       }else if(!p0.getQueue().offer(p1)){
          this.cancelAll();
          this.onError(new MissingBackpressureException("Queue full?!"));
          return;
       }else if(this.getAndIncrement()){
          return;
       }
       this.drainLoop();
       return;
    }
}
