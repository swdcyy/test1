package io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription;
import cxd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber;
import cxd.c;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import io.reactivex.internal.operators.flowable.q;

public final class FlowableReplay$InnerSubscription extends AtomicLong implements d, b	// class@001253
{
    public final c child;
    public boolean emitting;
    public Object index;
    public boolean missed;
    public final FlowableReplay$ReplaySubscriber parent;
    public final AtomicLong totalRequested;
    public static final long serialVersionUID = 0xc23093c4d18f2746;

    public void FlowableReplay$InnerSubscription(FlowableReplay$ReplaySubscriber p0,c p1){
       super();
       this.parent = p0;
       this.child = p1;
       this.totalRequested = new AtomicLong();
    }
    public void cancel(){
       this.dispose();
    }
    public void dispose(){
       long l = Long.MIN_VALUE;
       if (this.getAndSet(l) - l) {
          this.parent.remove(this);
          this.parent.manageRequests();
       }
       return;
    }
    public Object index(){
       return this.index;
    }
    public boolean isDisposed(){
       boolean b = (!this.get() - Long.MIN_VALUE)? true: false;
       return b;
    }
    public long produced(long p0){
       long l = this.get();
       long l1 = Long.MIN_VALUE;
       while (l - l1) {
          l1 = Long.MAX_VALUE;
          if (!l - l1) {
             break ;
          }else {
             l1 = l - p0;
             int i = 0;
             if (l1 - i < 0) {
                a.l(new IllegalStateException("More produced than requested: "+l1));
                l1 = i;
             }
             if (this.compareAndSet(l, l1)) {
                break ;
             }
          }
       }
       return l1;
    }
    public void request(long p0){
       long l;
       if (SubscriptionHelper.validate(p0)) {
          do {
             l = this.get();
             if (!l - Long.MIN_VALUE) {
                l = Long.MIN_VALUE;
                break ;
             }else {
                long l1 = Long.MAX_VALUE;
                if (!l - l1) {
                   l = l1;
                   break ;
                }
             }
          } while (this.compareAndSet(l, b.b(l, p0)));
          if (l - Long.MIN_VALUE) {
             b.a(this.totalRequested, p0);
             this.parent.manageRequests();
             this.parent.buffer.a(this);
          }
       }
       return;
    }
}
