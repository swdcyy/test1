package io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import grd.g;
import io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedEmitLast;
import io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedNoLast;

public final class ObservableSampleTimed extends a	// class@00135a
{
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final boolean f;

    public void ObservableSampleTimed(w p0,long p1,TimeUnit p2,z p3,boolean p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       g og = new g(p0);
       if (this.f != null) {
          ObservableSampleTimed$SampleTimedEmitLast sampleTimedE = new ObservableSampleTimed$SampleTimedEmitLast(og, this.c, this.d, this.e);
          this.b.subscribe(v6);
       }else {
          ObservableSampleTimed$SampleTimedNoLast sampleTimedN = new ObservableSampleTimed$SampleTimedNoLast(og, this.c, this.d, this.e);
          this.b.subscribe(v6);
       }
       return;
    }
}
