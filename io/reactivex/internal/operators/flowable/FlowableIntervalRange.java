package io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import brd.h;
import java.util.concurrent.TimeUnit;
import brd.z;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange$IntervalRangeSubscriber;
import cxd.d;
import io.reactivex.internal.schedulers.k;
import brd.z$c;
import crd.b;
import java.lang.Runnable;

public final class FlowableIntervalRange extends h	// class@001240
{
    public final z c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final TimeUnit h;

    public void FlowableIntervalRange(long p0,long p1,long p2,long p3,TimeUnit p4,z p5){
       super();
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.c = p5;
       this.d = p0;
       this.e = p1;
    }
    public void D(c p0){
       FlowableIntervalRange$IntervalRangeSubscriber intervalRang = new FlowableIntervalRange$IntervalRangeSubscriber(p0, this.d, this.e);
       p0.onSubscribe(v7);
       FlowableIntervalRange tc = this.c;
       if (tc instanceof k) {
          z$c uoc = tc.b();
          v7.setResource(uoc);
          uoc.d(v7, this.f, this.g, this.h);
       }else {
          v7.setResource(tc.f(v7, this.f, this.g, this.h));
       }
       return;
    }
}
