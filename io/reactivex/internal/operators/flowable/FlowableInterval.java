package io.reactivex.internal.operators.flowable.FlowableInterval;
import brd.h;
import java.util.concurrent.TimeUnit;
import brd.z;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableInterval$IntervalSubscriber;
import cxd.d;
import io.reactivex.internal.schedulers.k;
import brd.z$c;
import crd.b;
import java.lang.Runnable;

public final class FlowableInterval extends h	// class@00123e
{
    public final z c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public void FlowableInterval(long p0,long p1,TimeUnit p2,z p3){
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.c = p3;
    }
    public void D(c p0){
       FlowableInterval$IntervalSubscriber intervalSubs = new FlowableInterval$IntervalSubscriber(p0);
       p0.onSubscribe(intervalSubs);
       FlowableInterval tc = this.c;
       if (tc instanceof k) {
          z$c uoc = tc.b();
          intervalSubs.setResource(uoc);
          uoc.d(intervalSubs, this.d, this.e, this.f);
       }else {
          intervalSubs.setResource(tc.f(intervalSubs, this.d, this.e, this.f));
       }
       return;
    }
}
