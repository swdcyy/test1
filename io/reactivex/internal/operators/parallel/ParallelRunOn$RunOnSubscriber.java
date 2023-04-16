package io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnSubscriber;
import io.reactivex.internal.operators.parallel.ParallelRunOn$BaseRunOnSubscriber;
import cxd.c;
import io.reactivex.internal.queue.SpscArrayQueue;
import brd.z$c;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;

public final class ParallelRunOn$RunOnSubscriber extends ParallelRunOn$BaseRunOnSubscriber	// class@00144f
{
    public final c actual;
    public static final long serialVersionUID = 0xeeb976b788f368a;

    public void ParallelRunOn$RunOnSubscriber(c p0,int p1,SpscArrayQueue p2,z$c p3){
       super(p1, p2, p3);
       this.actual = p0;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
          p0.request((long)this.prefetch);
       }
       return;
    }
    public void run(){
       ParallelRunOn$BaseRunOnSubscriber uBaseRunOnSu = this;
       ParallelRunOn$BaseRunOnSubscriber consumed = uBaseRunOnSu.consumed;
       ParallelRunOn$BaseRunOnSubscriber queue = uBaseRunOnSu.queue;
       ParallelRunOn$RunOnSubscriber actual = uBaseRunOnSu.actual;
       ParallelRunOn$BaseRunOnSubscriber limit = uBaseRunOnSu.limit;
       int i = 1;
       do {
          long l = uBaseRunOnSu.requested.get();
          int i1 = 0;
          long l1 = i1;
          while (true) {
             if (v13 = l1 - l) {
                if (uBaseRunOnSu.cancelled != null) {
                   queue.clear();
                   return;
                }else {
                   ParallelRunOn$BaseRunOnSubscriber done = uBaseRunOnSu.done;
                   if (done != null) {
                      ParallelRunOn$BaseRunOnSubscriber error = uBaseRunOnSu.error;
                      if (error != null) {
                         queue.clear();
                         actual.onError(error);
                         uBaseRunOnSu.worker.dispose();
                         return;
                      }
                   }
                   Object obj = queue.poll();
                   int i2 = (obj == null)? 1: 0;
                   if (done != null && i2) {
                      actual.onComplete();
                      uBaseRunOnSu.worker.dispose();
                      return;
                   }else if(i2){
                   label_0064 :
                      if (!v13) {
                         if (uBaseRunOnSu.cancelled != null) {
                            queue.clear();
                            return;
                         }else if(uBaseRunOnSu.done != null){
                            ParallelRunOn$BaseRunOnSubscriber error1 = uBaseRunOnSu.error;
                            if (error1 != null) {
                               queue.clear();
                               actual.onError(error1);
                               uBaseRunOnSu.worker.dispose();
                               return;
                            }else if(queue.isEmpty()){
                               actual.onComplete();
                               uBaseRunOnSu.worker.dispose();
                               return;
                            }
                         }
                      }
                      if (l1 - i1 && l - Long.MAX_VALUE) {
                         long l2 = - l1;
                         uBaseRunOnSu.requested.addAndGet(l2);
                      }
                      int i3 = this.get();
                      if (i3 == i) {
                         uBaseRunOnSu.consumed = consumed;
                         i = - i;
                         i = uBaseRunOnSu.addAndGet(i);
                         if (!i) {
                            break ;
                         }else {
                            continue ;
                         }
                      }else {
                         i = i3;
                         continue ;
                      }
                   }else {
                      actual.onNext(obj);
                      l1 = l1 + 1;
                      consumed = consumed + 1;
                      if (consumed == limit) {
                         uBaseRunOnSu.s.request((long)consumed);
                         consumed = null;
                      }
                   }
                }
             }else {
                goto label_0064 ;
             }
          }
          return;
       } while (!i);
    }
}
