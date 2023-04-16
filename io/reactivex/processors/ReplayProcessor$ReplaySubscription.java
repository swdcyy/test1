package io.reactivex.processors.ReplayProcessor$ReplaySubscription;
import cxd.d;
import java.util.concurrent.atomic.AtomicInteger;
import cxd.c;
import io.reactivex.processors.ReplayProcessor;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import io.reactivex.processors.ReplayProcessor$a;

public final class ReplayProcessor$ReplaySubscription extends AtomicInteger implements d	// class@0014e3
{
    public final c actual;
    public boolean cancelled;
    public long emitted;
    public Object index;
    public final AtomicLong requested;
    public final ReplayProcessor state;
    public static final long serialVersionUID = 0x679849349531b12;

    public void ReplayProcessor$ReplaySubscription(c p0,ReplayProcessor p1){
       super();
       this.actual = p0;
       this.state = p1;
       this.requested = new AtomicLong();
    }
    public void cancel(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.state.M(this);
       }
       return;
    }
    public void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this.requested, p0);
          this.state.c.a(this);
       }
       return;
    }
}
