package io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed$DebounceTimedObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableThrottleFirstTimed$DebounceTimedObserver extends AtomicReference implements y, b, Runnable	// class@0018bf
{
    public final y actual;
    public boolean done;
    public boolean gate;
    public b s;
    public final long timeout;
    public final TimeUnit unit;
    public final z$c worker;
    public static final long serialVersionUID = 0xaebf798afbe73bf;

    public void ObservableThrottleFirstTimed$DebounceTimedObserver(y p0,long p1,TimeUnit p2,z$c p3){
       super();
       this.actual = p0;
       this.timeout = p1;
       this.unit = p2;
       this.worker = p3;
    }
    public void dispose(){
       this.s.dispose();
       this.worker.dispose();
    }
    public boolean isDisposed(){
       return this.worker.isDisposed();
    }
    public void onComplete(){
       if (this.done == null) {
          this.done = true;
          this.actual.onComplete();
          this.worker.dispose();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
       }else {
          this.done = true;
          this.actual.onError(p0);
          this.worker.dispose();
       }
       return;
    }
    public void onNext(Object p0){
       if (this.gate == null && this.done == null) {
          this.gate = true;
          this.actual.onNext(p0);
          p0 = this.get();
          if (p0 != null) {
             p0.dispose();
          }
          DisposableHelper.replace(this, this.worker.c(this, this.timeout, this.unit));
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void run(){
       this.gate = false;
    }
}
