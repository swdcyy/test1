package io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import brd.k;
import cxd.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscribers.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.fuseable.l;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.util.m;
import io.reactivex.internal.fuseable.o;

public final class InnerQueuedSubscriber extends AtomicReference implements k, d	// class@0014b9
{
    public boolean done;
    public int fusionMode;
    public final int limit;
    public final c parent;
    public final int prefetch;
    public long produced;
    public o queue;
    public static final long serialVersionUID = 0x51462814a312b8;

    public void InnerQueuedSubscriber(c p0,int p1){
       super();
       this.parent = p0;
       this.prefetch = p1;
       this.limit = p1 - (p1 >> 2);
    }
    public void cancel(){
       SubscriptionHelper.cancel(this);
    }
    public boolean isDone(){
       return this.done;
    }
    public void onComplete(){
       this.parent.a(this);
    }
    public void onError(Throwable p0){
       this.parent.b(this, p0);
    }
    public void onNext(Object p0){
       if (this.fusionMode == null) {
          this.parent.c(this, p0);
       }else {
          this.parent.drain();
       }
       return;
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.setOnce(this, p0)) {
          if (p0 instanceof l) {
             k ok = p0;
             int i = ok.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.fusionMode = i;
                this.queue = ok;
                this.done = b;
                this.parent.a(this);
                return;
             }else if(i == 2){
                this.fusionMode = i;
                this.queue = ok;
                m.d(p0, this.prefetch);
                return;
             }
          }
          this.queue = m.b(this.prefetch);
          m.d(p0, this.prefetch);
       }
       return;
    }
    public o queue(){
       return this.queue;
    }
    public void request(long p0){
       if (this.fusionMode != 1) {
          long l = this.produced + p0;
          if (l - (long)this.limit >= 0) {
             this.produced = 0;
             this.get().request(l);
          }else {
             this.produced = l;
          }
       }
       return;
    }
    public void requestOne(){
       if (this.fusionMode != 1) {
          long l = this.produced + 1;
          if (!l - (long)this.limit) {
             this.produced = 0;
             this.get().request(l);
          }else {
             this.produced = l;
          }
       }
       return;
    }
    public void setDone(){
       this.done = true;
    }
}
