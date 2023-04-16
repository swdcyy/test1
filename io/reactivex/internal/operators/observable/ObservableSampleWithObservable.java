package io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import grd.g;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainEmitLast;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainNoLast;

public final class ObservableSampleWithObservable extends a	// class@00135f
{
    public final w c;
    public final boolean d;

    public void ObservableSampleWithObservable(w p0,w p1,boolean p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       g og = new g(p0);
       if (this.d != null) {
          this.b.subscribe(new ObservableSampleWithObservable$SampleMainEmitLast(og, this.c));
       }else {
          this.b.subscribe(new ObservableSampleWithObservable$SampleMainNoLast(og, this.c));
       }
       return;
    }
}
