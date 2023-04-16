package io.reactivex.internal.operators.observable.ObservableRangeLong;
import brd.t;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableRangeLong$RangeDisposable;
import crd.b;

public final class ObservableRangeLong extends t	// class@001334
{
    public final long b;
    public final long c;

    public void ObservableRangeLong(long p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       ObservableRangeLong tb = this.b;
       ObservableRangeLong$RangeDisposable rangeDisposa = new ObservableRangeLong$RangeDisposable(p0, tb, (tb + this.c));
       p0.onSubscribe(v6);
       v6.run();
    }
}
