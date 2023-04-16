package io.reactivex.internal.operators.parallel.ParallelRunOn$BaseRunOnSubscriber;
import brd.k;
import cxd.d;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.queue.SpscArrayQueue;
import brd.z$c;
import java.util.concurrent.atomic.AtomicLong;
import crd.b;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;

public abstract class ParallelRunOn$BaseRunOnSubscriber extends AtomicInteger implements k, d, Runnable	// class@00144d
{
    public boolean cancelled;
    public int consumed;
    public boolean done;
    public Throwable error;
    public final int limit;
    public final int prefetch;
    public final SpscArrayQueue queue;
    public final AtomicLong requested;
    public d s;
    public final z$c worker;
    public static final long serialVersionUID = 0x7ffc3440018b78e6;

    public void ParallelRunOn$BaseRunOnSubscriber(int p0,SpscArrayQueue p1,z$c p2){
       super();
       this.requested = new AtomicLong();
       this.prefetch = p0;
       this.queue = p1;
       this.limit = p0 - (p0 >> 2);
       this.worker = p2;
    }
    public final void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.cancel();
          this.worker.dispose();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public final void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.schedule();
       return;
    }
    public final void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.error = p0;
          this.done = true;
          this.schedule();
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       if (!this.queue.offer(p0)) {
          this.s.cancel();
          this.onError(new MissingBackpressureException("Queue is full?!"));
          return;
       }else {
          this.schedule();
          return;
       }
    }
    public final void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.schedule();
       }
       return;
    }
    public final void schedule(){
       if (!this.getAndIncrement()) {
          this.worker.b(this);
       }
       return;
    }
}
