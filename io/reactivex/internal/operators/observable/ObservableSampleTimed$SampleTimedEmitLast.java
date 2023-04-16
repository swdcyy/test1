package io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedEmitLast;
import io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver;
import brd.y;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableSampleTimed$SampleTimedEmitLast extends ObservableSampleTimed$SampleTimedObserver	// class@001357
{
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0x9ce9a3cc07000b6d;

    public void ObservableSampleTimed$SampleTimedEmitLast(y p0,long p1,TimeUnit p2,z p3){
       super(p0, p1, p2, p3);
       this.wip = new AtomicInteger(1);
    }
    public void complete(){
       this.emit();
       if (!this.wip.decrementAndGet()) {
          this.actual.onComplete();
       }
       return;
    }
    public void run(){
       if (this.wip.incrementAndGet() == 2) {
          this.emit();
          if (!this.wip.decrementAndGet()) {
             this.actual.onComplete();
          }
       }
       return;
    }
}
