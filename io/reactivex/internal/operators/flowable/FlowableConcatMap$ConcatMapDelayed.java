package io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber;
import cxd.c;
import erd.o;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.fuseable.o;
import java.lang.String;
import io.reactivex.internal.functions.a;
import cxd.b;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$c;
import drd.a;
import ird.a;

public final class FlowableConcatMap$ConcatMapDelayed extends FlowableConcatMap$BaseConcatMapSubscriber	// class@00121a
{
    public final c actual;
    public final boolean veryEnd;
    public static final long serialVersionUID = 0xd71e7ecb62551796;

    public void FlowableConcatMap$ConcatMapDelayed(c p0,o p1,int p2,boolean p3){
       super(p1, p2);
       this.actual = p0;
       this.veryEnd = p3;
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.inner.cancel();
          this.s.cancel();
       }
       return;
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          while (true) {
             if (this.cancelled != null) {
                return;
             }
             if (this.active == null) {
                FlowableConcatMap$BaseConcatMapSubscriber tdone = this.done;
                if (tdone != null && (this.veryEnd == null && this.errors.get() != null)) {
                   this.actual.onError(this.errors.terminate());
                   return;
                }else {
                   FlowableConcatMap$BaseConcatMapSubscriber obj = this.queue.poll();
                   int i = 0;
                   FlowableConcatMap$BaseConcatMapSubscriber uBaseConcatM = (obj == null)? 1: null;
                   if (tdone != null && uBaseConcatM) {
                      Throwable throwable = this.errors.terminate();
                      if (throwable != null) {
                         this.actual.onError(throwable);
                      }else {
                         this.actual.onComplete();
                      }
                      return;
                   }else if(!uBaseConcatM){
                      Object obj1 = this.mapper.apply(obj);
                      a.c(obj1, "The mapper returned a null Publisher");
                      if (this.sourceMode != 1) {
                         int i1 = this.consumed + 1;
                         if (i1 == this.limit) {
                            this.consumed = i;
                            this.s.request((long)i1);
                         }else {
                            this.consumed = i1;
                         }
                      }
                      if (obj1 instanceof Callable) {
                         obj1 = obj1.call();
                         if (obj1 == null) {
                            continue ;
                         }else if(this.inner.isUnbounded()){
                            this.actual.onNext(obj1);
                         }else {
                            this.active = true;
                            obj = this.inner;
                            obj.setSubscription(new FlowableConcatMap$c(obj1, obj));
                         }
                      }else {
                         this.active = true;
                         obj1.subscribe(this.inner);
                      }
                   }
                }
             }
             if (this.decrementAndGet()) {
             }
          }
       }
       return;
    }
    public void innerError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          if (this.veryEnd == null) {
             this.s.cancel();
             this.done = true;
          }
          this.active = false;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void request(long p0){
       this.inner.request(p0);
    }
    public void subscribeActual(){
       this.actual.onSubscribe(this);
    }
}
