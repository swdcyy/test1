package io.reactivex.internal.operators.flowable.FlowableConcatArray$ConcatArraySubscriber;
import brd.k;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import cxd.b;
import cxd.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.exceptions.CompositeException;
import java.lang.Iterable;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.ArrayList;
import cxd.d;

public final class FlowableConcatArray$ConcatArraySubscriber extends SubscriptionArbiter implements k	// class@001217
{
    public final c actual;
    public final boolean delayError;
    public List errors;
    public int index;
    public long produced;
    public final b[] sources;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x8ec7d092aaceaf54;

    public void FlowableConcatArray$ConcatArraySubscriber(b[] p0,boolean p1,c p2){
       super();
       this.actual = p2;
       this.sources = p0;
       this.delayError = p1;
       this.wip = new AtomicInteger();
    }
    public void onComplete(){
       FlowableConcatArray$ConcatArraySubscriber terrors;
       if (!this.wip.getAndIncrement()) {
          FlowableConcatArray$ConcatArraySubscriber tsources = this.sources;
          int len = tsources.length;
          FlowableConcatArray$ConcatArraySubscriber tindex = this.index;
          while (true) {
             int i = 1;
             if (tindex == len) {
                tsources = this.errors;
                if (tsources != null) {
                   if (tsources.size() == i) {
                      this.actual.onError(tsources.get(0));
                   }else {
                      this.actual.onError(new CompositeException(tsources));
                   }
                }else {
                   this.actual.onComplete();
                }
                return;
             }else {
                object oobject = tsources[tindex];
                if (oobject == null) {
                   NullPointerException nullPointerE = new NullPointerException("A Publisher entry is null");
                   if (this.delayError != null) {
                      terrors = this.errors;
                      if (terrors == null) {
                         int i1 = len - tindex;
                         i1 = i1 + i;
                         terrors = new ArrayList(i1);
                         this.errors = terrors;
                      }
                      terrors.add(nullPointerE);
                      tindex = tindex + 1;
                   }else {
                      this.actual.onError(nullPointerE);
                      return;
                   }
                }else {
                   terrors = this.produced;
                   if (terrors) {
                      this.produced = 0;
                      this.produced(terrors);
                   }
                   oobject.subscribe(this);
                   tindex = tindex + 1;
                   this.index = tindex;
                   if (this.wip.decrementAndGet()) {
                   }
                }
             }
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.delayError != null) {
          FlowableConcatArray$ConcatArraySubscriber terrors = this.errors;
          if (terrors == null) {
             terrors = new ArrayList(((this.sources.length - this.index) + 1));
             this.errors = terrors;
          }
          terrors.add(p0);
          this.onComplete();
       }else {
          this.actual.onError(p0);
       }
       return;
    }
    public void onNext(Object p0){
       this.produced = this.produced + 1;
       this.actual.onNext(p0);
    }
    public void onSubscribe(d p0){
       this.setSubscription(p0);
    }
}
