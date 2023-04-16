package io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import io.reactivex.internal.util.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.String;
import io.reactivex.internal.functions.a;

public class SubscriptionArbiter extends AtomicInteger implements d	// class@0014c4
{
    public d actual;
    public boolean cancelled;
    public final AtomicLong missedProduced;
    public final AtomicLong missedRequested;
    public final AtomicReference missedSubscription;
    public long requested;
    public boolean unbounded;
    public static final long serialVersionUID = 0xe19d4040b4a4ed02;

    public void SubscriptionArbiter(){
       super();
       this.missedSubscription = new AtomicReference();
       this.missedRequested = new AtomicLong();
       this.missedProduced = new AtomicLong();
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.drain();
       }
       return;
    }
    public final void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       this.drainLoop();
       return;
    }
    public final void drainLoop(){
       SubscriptionArbiter subscription = this;
       Object obj = null;
       int i = 1;
       d uod = obj;
       long l = 0;
       do {
          d uod1 = subscription.missedSubscription.get();
          if (uod1 != null) {
             uod1 = subscription.missedSubscription.getAndSet(obj);
          }
          long l1 = subscription.missedRequested.get();
          if (l1) {
             l1 = subscription.missedRequested.getAndSet(0);
          }
          long l2 = subscription.missedProduced.get();
          if (l2) {
             l2 = subscription.missedProduced.getAndSet(0);
          }
          SubscriptionArbiter actual = subscription.actual;
          if (subscription.cancelled != null) {
             if (actual != null) {
                actual.cancel();
                subscription.actual = obj;
             }
             if (uod1 != null) {
                uod1.cancel();
             }
          }else {
             SubscriptionArbiter requested = subscription.requested;
             if (requested - Long.MAX_VALUE) {
                requested = b.b(requested, l1);
                if (requested - Long.MAX_VALUE) {
                   requested = requested - l2;
                   if (requested < 0) {
                      SubscriptionHelper.reportMoreProduced(requested);
                      requested = 0;
                   }
                }
                subscription.requested = requested;
             }
             if (uod1 != null) {
                if (actual != null) {
                   actual.cancel();
                }
                subscription.actual = uod1;
                if (requested) {
                   l = b.b(l, requested);
                   uod = uod1;
                }
             }else if(actual != null && l1){
                l = b.b(l, l1);
                uod = actual;
             }
          }
          i = - i;
       } while (!subscription.addAndGet(i));
       if (l) {
          uod.request(l);
       }
       return;
    }
    public final boolean isCancelled(){
       return this.cancelled;
    }
    public final boolean isUnbounded(){
       return this.unbounded;
    }
    public final void produced(long p0){
       if (this.unbounded != null) {
          return;
       }
       if (!this.get() && this.compareAndSet(0, 1)) {
          SubscriptionArbiter trequested = this.requested;
          if (trequested - Long.MAX_VALUE) {
             long l = trequested - p0;
             int i = 0;
             if (l - i < 0) {
                SubscriptionHelper.reportMoreProduced(l);
                l = i;
             }
             this.requested = l;
          }
          if (!this.decrementAndGet()) {
             return;
          }else {
             this.drainLoop();
             return;
          }
       }else {
          b.a(this.missedProduced, p0);
          this.drain();
          return;
       }
    }
    public final void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          if (this.unbounded != null) {
             return;
          }else if(!this.get()){
             int i = 1;
             if (this.compareAndSet(0, i)) {
                SubscriptionArbiter trequested = this.requested;
                if (trequested - Long.MAX_VALUE) {
                   long l = b.b(trequested, p0);
                   this.requested = l;
                   if (!l - Long.MAX_VALUE) {
                      this.unbounded = i;
                   }
                }
                SubscriptionArbiter tactual = this.actual;
                if (this.decrementAndGet()) {
                   this.drainLoop();
                }
                if (tactual != null) {
                   tactual.request(p0);
                }
                return;
             }
          }
          b.a(this.missedRequested, p0);
          this.drain();
       }
       return;
    }
    public final void setSubscription(d p0){
       if (this.cancelled != null) {
          p0.cancel();
          return;
       }else {
          a.c(p0, "s is null");
          if (!this.get() && this.compareAndSet(0, 1)) {
             SubscriptionArbiter tactual = this.actual;
             if (tactual != null) {
                tactual.cancel();
             }
             this.actual = p0;
             tactual = this.requested;
             if (this.decrementAndGet()) {
                this.drainLoop();
             }
             if (tactual) {
                p0.request(tactual);
             }
             return;
          }else {
             p0 = this.missedSubscription.getAndSet(p0);
             if (p0 != null) {
                p0.cancel();
             }
             this.drain();
             return;
          }
       }
    }
}
