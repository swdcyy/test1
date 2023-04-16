package io.reactivex.internal.operators.parallel.ParallelJoin;
import brd.h;
import hrd.a;
import cxd.c;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionDelayError;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscription;
import cxd.d;
import io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase;

public final class ParallelJoin extends h	// class@00144c
{
    public final a c;
    public final int d;
    public final boolean e;

    public void ParallelJoin(a p0,int p1,boolean p2){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public void D(c p0){
       ParallelJoin$JoinSubscriptionDelayError joinSubscrip = (this.e != null)? new ParallelJoin$JoinSubscriptionDelayError(p0, this.c.b(), this.d): new ParallelJoin$JoinSubscription(p0, this.c.b(), this.d);
       p0.onSubscribe(joinSubscrip);
       this.c.e(joinSubscrip.subscribers);
       return;
    }
}
