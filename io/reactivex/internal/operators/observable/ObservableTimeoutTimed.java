package io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutObserver;
import brd.z$c;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutFallbackObserver;

public final class ObservableTimeoutTimed extends a	// class@001383
{
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final w f;

    public void ObservableTimeoutTimed(t p0,long p1,TimeUnit p2,z p3,w p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       if (this.f == null) {
          ObservableTimeoutTimed$TimeoutObserver timeoutObser = new ObservableTimeoutTimed$TimeoutObserver(p0, this.c, this.d, this.e.b());
          p0.onSubscribe(v0);
          v0.startTimeout(0);
          this.b.subscribe(v0);
       }else {
          ObservableTimeoutTimed$TimeoutFallbackObserver timeoutFallb = new ObservableTimeoutTimed$TimeoutFallbackObserver(p0, this.c, this.d, this.e.b(), this.f);
          p0.onSubscribe(v0);
          v0.startTimeout(0);
          this.b.subscribe(v0);
       }
       return;
    }
}
