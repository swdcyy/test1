package io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import brd.t;
import brd.e0;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable$FlatMapObserver;
import crd.b;
import brd.d0;

public final class SingleFlatMapObservable extends t	// class@0012df
{
    public final e0 b;
    public final o c;

    public void SingleFlatMapObservable(e0 p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       SingleFlatMapObservable$FlatMapObserver uFlatMapObse = new SingleFlatMapObservable$FlatMapObserver(p0, this.c);
       p0.onSubscribe(uFlatMapObse);
       this.b.b(uFlatMapObse);
    }
}
