package io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import cxd.c;
import erd.a;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.queue.SpscArrayQueue;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.fuseable.n;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;
import drd.a;
import java.lang.RuntimeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;

public final class FlowableOnBackpressureBuffer$BackpressureBufferSubscriber extends BasicIntQueueSubscription implements k	// class@001245
{
    public final c actual;
    public boolean cancelled;
    public final boolean delayError;
    public boolean done;
    public Throwable error;
    public final a onOverflow;
    public boolean outputFused;
    public final n queue;
    public final AtomicLong requested;
    public d s;
    public static final long serialVersionUID = 0xdd1a90e4e0555e3e;

    public void FlowableOnBackpressureBuffer$BackpressureBufferSubscriber(c p0,int p1,boolean p2,boolean p3,a p4){
       super();
       this.requested = new AtomicLong();
       this.actual = p0;
       this.onOverflow = p4;
       this.delayError = p3;
       a uoa = (p2)? new a(p1): new SpscArrayQueue(p1);
       this.queue = uoa;
       return;
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.cancel();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public boolean checkTerminated(boolean p0,boolean p1,c p2){
       FlowableOnBackpressureBuffer$BackpressureBufferSubscriber terror;
       if (this.cancelled != null) {
          this.queue.clear();
          return true;
       }else if(p0){
          if (this.delayError != null) {
             if (p1) {
                terror = this.error;
                if (terror != null) {
                   p2.onError(terror);
                }else {
                   p2.onComplete();
                }
                return true;
             }
          }else {
             terror = this.error;
             if (terror != null) {
                this.queue.clear();
                p2.onError(terror);
                return true;
             }else if(p1){
                p2.onComplete();
                return true;
             }
          }
       }
       return false;
    }
    public void clear(){
       this.queue.clear();
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          FlowableOnBackpressureBuffer$BackpressureBufferSubscriber tqueue = this.queue;
          FlowableOnBackpressureBuffer$BackpressureBufferSubscriber tactual = this.actual;
          int i = 1;
          while (true) {
             if (this.checkTerminated(this.done, tqueue.isEmpty(), tactual)) {
                return;
             }
             long l = this.requested.get();
             int i1 = 0;
             long l1 = i1;
             while (true) {
                if (v10 = l1 - l) {
                   FlowableOnBackpressureBuffer$BackpressureBufferSubscriber tdone = this.done;
                   Object obj = tqueue.poll();
                   boolean b = (obj == null)? true: false;
                   if (this.checkTerminated(tdone, b, tactual)) {
                      return;
                   }else if(b){
                   label_0042 :
                      if (!v10 && this.checkTerminated(this.done, tqueue.isEmpty(), tactual)) {
                         return;
                      }else if(l1 - i1 && l - Long.MAX_VALUE){
                         long l2 = - l1;
                         this.requested.addAndGet(l2);
                      }
                      i = - i;
                      if (this.addAndGet(i)) {
                      }
                   }else {
                      tactual.onNext(obj);
                      l1 = l1 + 1;
                   }
                }else {
                   goto label_0042 ;
                }
             }
          }
       }
       return;
    }
    public boolean isEmpty(){
       return this.queue.isEmpty();
    }
    public void onComplete(){
       this.done = true;
       if (this.outputFused != null) {
          this.actual.onComplete();
       }else {
          this.drain();
       }
       return;
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.done = true;
       if (this.outputFused != null) {
          this.actual.onError(p0);
       }else {
          this.drain();
       }
       return;
    }
    public void onNext(Object p0){
       if (!this.queue.offer(p0)) {
          this.s.cancel();
          p0 = new MissingBackpressureException("Buffer is full");
          this.onOverflow.run();
          this.onError(p0);
          return;
       }else if(this.outputFused != null){
          this.actual.onNext(null);
       }else {
          this.drain();
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
          p0.request(Long.MAX_VALUE);
       }
       return;
    }
    public Object poll(){
       return this.queue.poll();
    }
    public void request(long p0){
       if (this.outputFused == null && SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.drain();
       }
       return;
    }
    public int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       this.outputFused = true;
       return 2;
    }
}
