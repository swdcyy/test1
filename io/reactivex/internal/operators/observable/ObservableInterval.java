package io.reactivex.internal.operators.observable.ObservableInterval;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver;
import crd.b;
import io.reactivex.internal.schedulers.k;
import brd.z$c;
import java.lang.Runnable;

public final class ObservableInterval extends t	// class@00131c
{
    public final z b;
    public final long c;
    public final long d;
    public final TimeUnit e;

    public void ObservableInterval(long p0,long p1,TimeUnit p2,z p3){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.b = p3;
    }
    public void subscribeActual(y p0){
       ObservableInterval$IntervalObserver intervalObse = new ObservableInterval$IntervalObserver(p0);
       p0.onSubscribe(intervalObse);
       ObservableInterval tb = this.b;
       if (tb instanceof k) {
          z$c uoc = tb.b();
          intervalObse.setResource(uoc);
          uoc.d(intervalObse, this.c, this.d, this.e);
       }else {
          intervalObse.setResource(tb.f(intervalObse, this.c, this.d, this.e));
       }
       return;
    }
}
