package io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber;
import brd.k;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$b;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner;
import io.reactivex.internal.util.AtomicThrowable;
import java.lang.Object;
import io.reactivex.internal.fuseable.o;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import cxd.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.fuseable.l;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.SpscArrayQueue;

public abstract class FlowableConcatMap$BaseConcatMapSubscriber extends AtomicInteger implements k, FlowableConcatMap$b, d	// class@001219
{
    public boolean active;
    public boolean cancelled;
    public int consumed;
    public boolean done;
    public final AtomicThrowable errors;
    public final FlowableConcatMap$ConcatMapInner inner;
    public final int limit;
    public final o mapper;
    public final int prefetch;
    public o queue;
    public d s;
    public int sourceMode;
    public static final long serialVersionUID = 0xcf4539c033fbce45;

    public void FlowableConcatMap$BaseConcatMapSubscriber(o p0,int p1){
       super();
       this.mapper = p0;
       this.prefetch = p1;
       this.limit = p1 - (p1 >> 2);
       this.inner = new FlowableConcatMap$ConcatMapInner(this);
       this.errors = new AtomicThrowable();
    }
    public abstract void drain();
    public final void innerComplete(){
       this.active = false;
       this.drain();
    }
    public final void onComplete(){
       this.done = true;
       this.drain();
    }
    public final void onNext(Object p0){
       if (this.sourceMode != 2 && !this.queue.offer(p0)) {
          this.s.cancel();
          this.onError(new IllegalStateException("Queue full?!"));
          return;
       }else {
          this.drain();
          return;
       }
    }
    public final void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.s, p0)) {
          this.s = p0;
          if (p0 instanceof l) {
             k ok = p0;
             int i = ok.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.sourceMode = i;
                this.queue = ok;
                this.done = b;
                this.subscribeActual();
                this.drain();
                return;
             }else if(i == 2){
                this.sourceMode = i;
                this.queue = ok;
                this.subscribeActual();
                p0.request((long)this.prefetch);
                return;
             }
          }
          this.queue = new SpscArrayQueue(this.prefetch);
          this.subscribeActual();
          p0.request((long)this.prefetch);
       }
       return;
    }
    public abstract void subscribeActual();
}
