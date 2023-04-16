package io.reactivex.internal.operators.mixed.MaybeFlatMapObservable;
import brd.t;
import brd.q;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.mixed.MaybeFlatMapObservable$FlatMapObserver;
import crd.b;
import brd.p;

public final class MaybeFlatMapObservable extends t	// class@0012cb
{
    public final q b;
    public final o c;

    public void MaybeFlatMapObservable(q p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       MaybeFlatMapObservable$FlatMapObserver uFlatMapObse = new MaybeFlatMapObservable$FlatMapObserver(p0, this.c);
       p0.onSubscribe(uFlatMapObse);
       this.b.b(uFlatMapObse);
    }
}
