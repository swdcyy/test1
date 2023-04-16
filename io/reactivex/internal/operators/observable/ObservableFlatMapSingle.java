package io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver;

public final class ObservableFlatMapSingle extends a	// class@001311
{
    public final o c;
    public final boolean d;

    public void ObservableFlatMapSingle(w p0,o p1,boolean p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableFlatMapSingle$FlatMapSingleObserver(p0, this.c, this.d));
    }
}
