package io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber;
import brd.k;
import java.lang.Runnable;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import brd.z$c;
import java.util.concurrent.atomic.AtomicLong;
import cxd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.fuseable.o;
import cxd.c;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;

public abstract class FlowableObserveOn$BaseObserveOnSubscriber extends BasicIntQueueSubscription implements k, Runnable	// class@001241
{
    public boolean cancelled;
    public final boolean delayError;
    public boolean done;
    public Throwable error;
    public final int limit;
    public boolean outputFused;
    public final int prefetch;
    public long produced;
    public o queue;
    public final AtomicLong requested;
    public d s;
    public int sourceMode;
    public final z$c worker;
    public static final long serialVersionUID = 0x8da213f8e9adffb7;

    public void FlowableObserveOn$BaseObserveOnSubscriber(z$c p0,boolean p1,int p2){
       super();
       this.worker = p0;
       this.delayError = p1;
       this.prefetch = p2;
       this.requested = new AtomicLong();
       this.limit = p2 - (p2 >> 2);
    }
    public final void cancel(){
       if (this.cancelled != null) {
          return;
       }
       this.cancelled = true;
       this.s.cancel();
       this.worker.dispose();
       if (!this.getAndIncrement()) {
          this.queue.clear();
       }
       return;
    }
    public final boolean checkTerminated(boolean p0,boolean p1,c p2){
       FlowableObserveOn$BaseObserveOnSubscriber terror;
       if (this.cancelled != null) {
          this.clear();
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
                this.worker.dispose();
                return true;
             }
          }else {
             terror = this.error;
             if (terror != null) {
                this.clear();
                p2.onError(terror);
                this.worker.dispose();
                return true;
             }else if(p1){
                p2.onComplete();
                this.worker.dispose();
                return true;
             }
          }
       }
       return false;
    }
    public final void clear(){
       this.queue.clear();
    }
    public final boolean isEmpty(){
       return this.queue.isEmpty();
    }
    public final void onComplete(){
       if (this.done == null) {
          this.done = true;
          this.trySchedule();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.error = p0;
          this.done = true;
          this.trySchedule();
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       if (this.sourceMode == 2) {
          this.trySchedule();
          return;
       }else if(!this.queue.offer(p0)){
          this.s.cancel();
          this.error = new MissingBackpressureException("Queue is full?!");
          this.done = true;
       }
       this.trySchedule();
       return;
    }
    public final void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.trySchedule();
       }
       return;
    }
    public final int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       this.outputFused = true;
       return 2;
    }
    public final void run(){
       if (this.outputFused != null) {
          this.runBackfused();
       }else if(this.sourceMode == 1){
          this.runSync();
       }else {
          this.runAsync();
       }
       return;
    }
    public abstract void runAsync();
    public abstract void runBackfused();
    public abstract void runSync();
    public final void trySchedule(){
       if (this.getAndIncrement()) {
          return;
       }
       this.worker.b(this);
       return;
    }
}
