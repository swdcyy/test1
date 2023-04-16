package io.reactivex.internal.operators.observable.ObservableTimer;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableTimer$TimerObserver;
import crd.b;
import java.lang.Runnable;

public final class ObservableTimer extends t	// class@0018c5
{
    public final z b;
    public final long c;
    public final TimeUnit d;

    public void ObservableTimer(long p0,TimeUnit p1,z p2){
       super();
       this.c = p0;
       this.d = p1;
       this.b = p2;
    }
    public void subscribeActual(y p0){
       ObservableTimer$TimerObserver timerObserve = new ObservableTimer$TimerObserver(p0);
       p0.onSubscribe(timerObserve);
       timerObserve.setResource(this.b.e(timerObserve, this.c, this.d));
    }
}
