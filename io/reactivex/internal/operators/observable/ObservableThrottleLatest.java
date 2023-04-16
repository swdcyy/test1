package io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest$ThrottleLatestObserver;
import brd.z$c;

public final class ObservableThrottleLatest extends a	// class@001378
{
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final boolean f;

    public void ObservableThrottleLatest(t p0,long p1,TimeUnit p2,z p3,boolean p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       ObservableThrottleLatest$ThrottleLatestObserver throttleLate = new ObservableThrottleLatest$ThrottleLatestObserver(p0, this.c, this.d, this.e.b(), this.f);
       this.b.subscribe(v8);
    }
}
