package io.reactivex.internal.operators.observable.ObservableRange;
import brd.t;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableRange$RangeDisposable;
import crd.b;

public final class ObservableRange extends t	// class@001332
{
    public final int b;
    public final long c;

    public void ObservableRange(int p0,int p1){
       super();
       this.b = p0;
       this.c = (long)p0 + (long)p1;
    }
    public void subscribeActual(y p0){
       ObservableRange$RangeDisposable rangeDisposa = new ObservableRange$RangeDisposable(p0, (long)this.b, this.c);
       p0.onSubscribe(v6);
       v6.run();
    }
}
