package io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public abstract class ObservableSampleTimed$SampleTimedObserver extends AtomicReference implements y, b, Runnable	// class@001359
{
    public final y actual;
    public final long period;
    public b s;
    public final z scheduler;
    public final AtomicReference timer;
    public final TimeUnit unit;
    public static final long serialVersionUID = 0xcf2ef70693764ead;

    public void ObservableSampleTimed$SampleTimedObserver(y p0,long p1,TimeUnit p2,z p3){
       super();
       this.timer = new AtomicReference();
       this.actual = p0;
       this.period = p1;
       this.unit = p2;
       this.scheduler = p3;
    }
    public void cancelTimer(){
       DisposableHelper.dispose(this.timer);
    }
    public abstract void complete();
    public void dispose(){
       this.cancelTimer();
       this.s.dispose();
    }
    public void emit(){
       Object andSet = this.getAndSet(null);
       if (andSet != null) {
          this.actual.onNext(andSet);
       }
       return;
    }
    public boolean isDisposed(){
       return this.s.isDisposed();
    }
    public void onComplete(){
       this.cancelTimer();
       this.complete();
    }
    public void onError(Throwable p0){
       this.cancelTimer();
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.lazySet(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
          ObservableSampleTimed$SampleTimedObserver tperiod = this.period;
          DisposableHelper.replace(this.timer, this.scheduler.f(this, tperiod, tperiod, this.unit));
       }
       return;
    }
}
