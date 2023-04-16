package io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapImmediate;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber;
import cxd.c;
import erd.o;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import java.lang.Object;
import io.reactivex.internal.fuseable.o;
import java.lang.String;
import io.reactivex.internal.functions.a;
import cxd.b;
import java.util.concurrent.Callable;
import java.lang.Throwable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.operators.flowable.FlowableConcatMap$c;
import drd.a;
import ird.a;

public final class FlowableConcatMap$ConcatMapImmediate extends FlowableConcatMap$BaseConcatMapSubscriber	// class@00121b
{
    public final c actual;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x6d9ede3055d54052;

    public void FlowableConcatMap$ConcatMapImmediate(c p0,o p1,int p2){
       super(p1, p2);
       this.actual = p0;
       this.wip = new AtomicInteger();
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
       if (!this.wip.getAndIncrement()) {
          while (true) {
             if (this.cancelled != null) {
                return;
             }
             if (this.active == null) {
                FlowableConcatMap$BaseConcatMapSubscriber tdone = this.done;
                FlowableConcatMap$BaseConcatMapSubscriber obj = this.queue.poll();
                int i = 0;
                FlowableConcatMap$BaseConcatMapSubscriber uBaseConcatM = (obj == null)? 1: null;
                if (tdone != null && uBaseConcatM) {
                   this.actual.onComplete();
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
                         if (!this.get() && this.compareAndSet(i, 1)) {
                            this.actual.onNext(obj1);
                            if (!this.compareAndSet(1, i)) {
                               this.actual.onError(this.errors.terminate());
                               return;
                            }
                         }
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
             if (this.wip.decrementAndGet()) {
             }
          }
       }
       return;
    }
    public void innerError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          this.s.cancel();
          if (!this.getAndIncrement()) {
             this.actual.onError(this.errors.terminate());
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerNext(Object p0){
       if (!this.get()) {
          int i = 0;
          if (this.compareAndSet(i, 1)) {
             this.actual.onNext(p0);
             if (this.compareAndSet(1, i)) {
                return;
             }else {
                this.actual.onError(this.errors.terminate());
             }
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          this.inner.cancel();
          if (!this.getAndIncrement()) {
             this.actual.onError(this.errors.terminate());
          }
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
