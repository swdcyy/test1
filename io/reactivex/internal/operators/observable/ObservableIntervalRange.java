package io.reactivex.internal.operators.observable.ObservableIntervalRange;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver;
import crd.b;
import io.reactivex.internal.schedulers.k;
import brd.z$c;
import java.lang.Runnable;

public final class ObservableIntervalRange extends t	// class@00131e
{
    public final z b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final TimeUnit g;

    public void ObservableIntervalRange(long p0,long p1,long p2,long p3,TimeUnit p4,z p5){
       super();
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.b = p5;
       this.c = p0;
       this.d = p1;
    }
    public void subscribeActual(y p0){
       ObservableIntervalRange$IntervalRangeObserver intervalRang = new ObservableIntervalRange$IntervalRangeObserver(p0, this.c, this.d);
       p0.onSubscribe(v7);
       ObservableIntervalRange tb = this.b;
       if (tb instanceof k) {
          z$c uoc = tb.b();
          v7.setResource(uoc);
          uoc.d(v7, this.e, this.f, this.g);
       }else {
          v7.setResource(tb.f(v7, this.e, this.f, this.g));
       }
       return;
    }
}
