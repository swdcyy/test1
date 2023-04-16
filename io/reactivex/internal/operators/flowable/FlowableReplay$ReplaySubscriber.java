package io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber;
import brd.k;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription;
import io.reactivex.internal.operators.flowable.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import java.lang.System;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import cxd.d;
import java.lang.Throwable;
import ird.a;

public final class FlowableReplay$ReplaySubscriber extends AtomicReference implements k, b	// class@001254
{
    public final q buffer;
    public boolean done;
    public final AtomicInteger management;
    public long maxChildRequested;
    public long maxUpstreamRequested;
    public final AtomicBoolean shouldConnect;
    public final AtomicReference subscribers;
    public static final FlowableReplay$InnerSubscription[] EMPTY;
    public static final FlowableReplay$InnerSubscription[] TERMINATED;
    public static final long serialVersionUID;

    static {
       FlowableReplay$InnerSubscription[] innerSubscri = new FlowableReplay$InnerSubscription[0];
       FlowableReplay$ReplaySubscriber.EMPTY = innerSubscri;
       FlowableReplay$InnerSubscription[] innerSubscri1 = new FlowableReplay$InnerSubscription[0];
       FlowableReplay$ReplaySubscriber.TERMINATED = innerSubscri1;
    }
    public void FlowableReplay$ReplaySubscriber(q p0){
       super();
       this.buffer = p0;
       this.management = new AtomicInteger();
       this.subscribers = new AtomicReference(FlowableReplay$ReplaySubscriber.EMPTY);
       this.shouldConnect = new AtomicBoolean();
    }
    public boolean add(FlowableReplay$InnerSubscription p0){
       Objects.requireNonNull(p0);
       while (true) {
          FlowableReplay$InnerSubscription[] innerSubscri = this.subscribers.get();
          if (innerSubscri == FlowableReplay$ReplaySubscriber.TERMINATED) {
             return false;
          }
          int len = innerSubscri.length;
          int i = len + 1;
          FlowableReplay$InnerSubscription[] innerSubscri1 = new FlowableReplay$InnerSubscription[i];
          System.arraycopy(innerSubscri, false, innerSubscri1, false, len);
          innerSubscri1[len] = p0;
          if (this.subscribers.compareAndSet(innerSubscri, innerSubscri1)) {
             break ;
          }
       }
       return true;
    }
    public void dispose(){
       this.subscribers.set(FlowableReplay$ReplaySubscriber.TERMINATED);
       SubscriptionHelper.cancel(this);
    }
    public boolean isDisposed(){
       boolean b = (this.subscribers.get() == FlowableReplay$ReplaySubscriber.TERMINATED)? true: false;
       return b;
    }
    public void manageRequests(){
       long l2;
       if (this.management.getAndIncrement()) {
          return;
       }
       int i = 1;
       while (true) {
          if (this.isDisposed()) {
             return;
          }
          FlowableReplay$InnerSubscription[] innerSubscri = this.subscribers.get();
          FlowableReplay$ReplaySubscriber tmaxChildReq = this.maxChildRequested;
          int len = innerSubscri.length;
          FlowableReplay$ReplaySubscriber replaySubscr = tmaxChildReq;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             replaySubscr = Math.max(replaySubscr, innerSubscri[i1].totalRequested.get());
          }
          FlowableReplay$ReplaySubscriber tmaxUpstream = this.maxUpstreamRequested;
          d uod = this.get();
          long l = replaySubscr - tmaxChildReq;
          long l1 = 0;
          if (l - l1) {
             this.maxChildRequested = replaySubscr;
             if (uod != null) {
                if (tmaxUpstream - l1) {
                   this.maxUpstreamRequested = l1;
                   l2 = tmaxUpstream + l;
                   uod.request(l2);
                }else {
                   uod.request(l);
                }
             }else {
                l2 = tmaxUpstream + l;
                if (l2 - l1 < 0) {
                   l2 = Long.MAX_VALUE;
                }
                this.maxUpstreamRequested = l2;
             }
          }else if(tmaxUpstream - l1 && uod != null){
             this.maxUpstreamRequested = l1;
             uod.request(tmaxUpstream);
          }
          i = - i;
          if (!this.management.addAndGet(i)) {
          }
       }
       return;
    }
    public void onComplete(){
       if (this.done == null) {
          this.done = true;
          this.buffer.complete();
          FlowableReplay$InnerSubscription[] andSet = this.subscribers.getAndSet(FlowableReplay$ReplaySubscriber.TERMINATED);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             this.buffer.a(andSet[i]);
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.done == null) {
          this.done = true;
          this.buffer.error(p0);
          FlowableReplay$InnerSubscription[] andSet = this.subscribers.getAndSet(FlowableReplay$ReplaySubscriber.TERMINATED);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             this.buffer.a(andSet[i]);
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.done == null) {
          this.buffer.next(p0);
          p0 = this.subscribers.get();
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             this.buffer.a(p0[i]);
          }
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.setOnce(this, p0)) {
          this.manageRequests();
          FlowableReplay$InnerSubscription[] innerSubscri = this.subscribers.get();
          int len = innerSubscri.length;
          for (int i = 0; i < len; i = i + 1) {
             this.buffer.a(innerSubscri[i]);
          }
       }
       return;
    }
    public void remove(FlowableReplay$InnerSubscription p0){
       FlowableReplay$InnerSubscription[] eMPTY;
       while (true) {
          FlowableReplay$InnerSubscription[] innerSubscri = this.subscribers.get();
          int len = innerSubscri.length;
          if (!len) {
             return;
          }
          FlowableReplay$ReplaySubscriber replaySubscr = -1;
          int i = 0;
          int i1 = 0;
          while (i1 < len) {
             if (innerSubscri[i1].equals(p0)) {
                replaySubscr = i1;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          if (replaySubscr < 0) {
             return;
          }
          i1 = 1;
          if (len == i1) {
             eMPTY = FlowableReplay$ReplaySubscriber.EMPTY;
          }else {
             int i2 = len - 1;
             FlowableReplay$InnerSubscription[] innerSubscri1 = new FlowableReplay$InnerSubscription[i2];
             System.arraycopy(innerSubscri, i, innerSubscri1, i, replaySubscr);
             i = replaySubscr + 1;
             len = len - replaySubscr;
             len = len - i1;
             System.arraycopy(innerSubscri, i, innerSubscri1, replaySubscr, len);
             eMPTY = innerSubscri1;
          }
          if (this.subscribers.compareAndSet(innerSubscri, eMPTY)) {
          }
       }
       return;
    }
}
