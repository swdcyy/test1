package io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedNoLast;
import io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver;
import brd.y;
import java.util.concurrent.TimeUnit;
import brd.z;

public final class ObservableSampleTimed$SampleTimedNoLast extends ObservableSampleTimed$SampleTimedObserver	// class@001358
{
    public static final long serialVersionUID = 0x9ce9a3cc07000b6d;

    public void ObservableSampleTimed$SampleTimedNoLast(y p0,long p1,TimeUnit p2,z p3){
       super(p0, p1, p2, p3);
    }
    public void complete(){
       this.actual.onComplete();
    }
    public void run(){
       this.emit();
    }
}
