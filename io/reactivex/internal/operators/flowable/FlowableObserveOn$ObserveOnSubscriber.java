package io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnSubscriber;
import io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber;
import cxd.c;
import brd.z$c;
import cxd.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.fuseable.l;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.lang.Object;
import io.reactivex.internal.fuseable.o;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Throwable;
import drd.a;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;

public final class FlowableObserveOn$ObserveOnSubscriber extends FlowableObserveOn$BaseObserveOnSubscriber	// class@001243
{
    public final c actual;
    public static final long serialVersionUID = 0xc0e5681707b5cbe6;

    public void FlowableObserveOn$ObserveOnSubscriber(c p0,z$c p1,boolean p2,int p3){
       super(p1, p2, p3);
       this.actual = p0;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          if (p0 instanceof l) {
             k ok = p0;
             int i = ok.requestFusion(7);
             int i1 = 1;
             if (i == i1) {
                this.sourceMode = i1;
                this.queue = ok;
                this.done = i1;
                this.actual.onSubscribe(this);
                return;
             }else if(i == 2){
                this.sourceMode = 2;
                this.queue = ok;
                this.actual.onSubscribe(this);
                p0.request((long)this.prefetch);
                return;
             }
          }
          this.queue = new SpscArrayQueue(this.prefetch);
          this.actual.onSubscribe(this);
          p0.request((long)this.prefetch);
       }
       return;
    }
    public Object poll(){
       Object obj = this.queue.poll();
       if (obj != null && this.sourceMode != 1) {
          long l = this.produced + 1;
          if (!l - (long)this.limit) {
             this.produced = 0;
             this.s.request(l);
          }else {
             this.produced = l;
          }
       }
       return obj;
    }
    public void runAsync(){
       FlowableObserveOn$ObserveOnSubscriber tactual = this.actual;
       FlowableObserveOn$BaseObserveOnSubscriber tqueue = this.queue;
       FlowableObserveOn$BaseObserveOnSubscriber tproduced = this.produced;
       int i = 1;
       do {
          long l = this.requested.get();
          while (true) {
             if (v8 = tproduced - l) {
                FlowableObserveOn$BaseObserveOnSubscriber tdone = this.done;
                Object obj = tqueue.poll();
                boolean b = (obj == null)? true: false;
                if (this.checkTerminated(tdone, b, tactual)) {
                   return;
                }else if(b){
                label_0061 :
                   if (!v8 && this.checkTerminated(this.done, tqueue.isEmpty(), tactual)) {
                      return;
                   }else {
                      int i1 = this.get();
                      if (i == i1) {
                         this.produced = tproduced;
                         i = - i;
                         i = this.addAndGet(i);
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
                }else {
                   tactual.onNext(obj);
                   tproduced = tproduced + 1;
                   if (!tproduced - (long)this.limit) {
                      if (l - Long.MAX_VALUE) {
                         long l1 = - tproduced;
                         l = this.requested.addAndGet(l1);
                      }
                      this.s.request(tproduced);
                      tproduced = 0;
                   }
                }
             }else {
                goto label_0061 ;
             }
          }
          return;
       } while (!i);
    }
    public void runBackfused(){
       FlowableObserveOn$BaseObserveOnSubscriber uBaseObserve = 1;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          this.actual.onNext(null);
          if (this.done != null) {
             uBaseObserve = this.error;
             if (uBaseObserve != null) {
                this.actual.onError(uBaseObserve);
                break ;
             }else {
                this.actual.onComplete();
                break ;
             }
          }else {
             int i = - uBaseObserve;
             if (!this.addAndGet(i)) {
                return;
             }
             continue ;
          }
       }
       this.worker.dispose();
       return;
    }
    public void runSync(){
       FlowableObserveOn$ObserveOnSubscriber tactual = this.actual;
       FlowableObserveOn$BaseObserveOnSubscriber tqueue = this.queue;
       FlowableObserveOn$BaseObserveOnSubscriber tproduced = this.produced;
       int i = 1;
       do {
          long l = this.requested.get();
          while (true) {
             if (tproduced - l) {
                Object obj = tqueue.poll();
                if (this.cancelled != null) {
                   break ;
                }else if(obj == null){
                   tactual.onComplete();
                   this.worker.dispose();
                   return;
                }else {
                   tactual.onNext(obj);
                   tproduced = tproduced + 1;
                }
             }else if(this.cancelled != null){
                return;
             }else if(tqueue.isEmpty()){
                tactual.onComplete();
                this.worker.dispose();
                return;
             }else {
                int i1 = this.get();
                if (i == i1) {
                   this.produced = tproduced;
                   i = - i;
                   i = this.addAndGet(i);
                   if (!i) {
                      return;
                   }
                   continue ;
                }else {
                   i = i1;
                   continue ;
                }
             }
          }
          return;
       } while (!i);
    }
}
