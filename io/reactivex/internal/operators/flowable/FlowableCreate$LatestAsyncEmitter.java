package io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;
import cxd.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.util.b;
import java.lang.NullPointerException;
import java.lang.String;

public final class FlowableCreate$LatestAsyncEmitter extends FlowableCreate$BaseEmitter	// class@001225
{
    public boolean done;
    public Throwable error;
    public final AtomicReference queue;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x37d61f4a35bdda6f;

    public void FlowableCreate$LatestAsyncEmitter(c p0){
       super(p0);
       this.queue = new AtomicReference();
       this.wip = new AtomicInteger();
    }
    public void drain(){
       FlowableCreate$LatestAsyncEmitter error;
       FlowableCreate$LatestAsyncEmitter latestAsyncE = this;
       if (latestAsyncE.wip.getAndIncrement()) {
          return;
       }
       FlowableCreate$BaseEmitter actual = latestAsyncE.actual;
       FlowableCreate$LatestAsyncEmitter queue = latestAsyncE.queue;
       int i = 1;
    label_0011 :
       long l = this.get();
       long l1 = 0;
       while (true) {
          int i1 = 0;
          if (v13 = l1 - l) {
             if (this.isCancelled()) {
                queue.lazySet(null);
                return;
             }else {
                FlowableCreate$LatestAsyncEmitter done = latestAsyncE.done;
                Object andSet = queue.getAndSet(null);
                int i2 = (andSet == null)? 1: 0;
                if (done != null && i2) {
                   error = latestAsyncE.error;
                   if (error != null) {
                      latestAsyncE.error(error);
                   }else {
                      this.complete();
                   }
                   return;
                }else if(i2){
                label_004f :
                   if (!v13) {
                      if (this.isCancelled()) {
                         queue.lazySet(null);
                         return;
                      }else {
                         FlowableCreate$LatestAsyncEmitter done1 = latestAsyncE.done;
                         if (queue.get() == null) {
                            i1 = 1;
                         }
                         if (done1 != null && i1) {
                            error = latestAsyncE.error;
                            if (error != null) {
                               latestAsyncE.error(error);
                               break ;
                            }else {
                               this.complete();
                               break ;
                            }
                         }
                      }
                   }
                   if (l1) {
                      b.c(latestAsyncE, l1);
                   }
                   i = - i;
                   if (!latestAsyncE.wip.addAndGet(i)) {
                      return;
                   }else {
                      goto label_0011 ;
                   }
                }else {
                   actual.onNext(andSet);
                   l1 = l1 + 1;
                }
             }
          }else {
             goto label_004f ;
          }
       }
       return;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onNext(Object p0){
       if (this.done == null && !this.isCancelled()) {
          if (p0 == null) {
             this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
             return;
          }else {
             this.queue.set(p0);
             this.drain();
          }
       }
       return;
    }
    public void onRequested(){
       this.drain();
    }
    public void onUnsubscribed(){
       if (!this.wip.getAndIncrement()) {
          this.queue.lazySet(null);
       }
       return;
    }
    public boolean tryOnError(Throwable p0){
       if (this.done != null || this.isCancelled()) {
          return false;
       }
       if (p0 == null) {
          this.onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
       }
       this.error = p0;
       this.done = true;
       this.drain();
       return true;
    }
}
