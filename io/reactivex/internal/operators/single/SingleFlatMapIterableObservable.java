package io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;
import brd.t;
import brd.e0;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable$FlatMapIterableObserver;
import brd.d0;

public final class SingleFlatMapIterableObservable extends t	// class@001469
{
    public final e0 b;
    public final o c;

    public void SingleFlatMapIterableObservable(e0 p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.b(new SingleFlatMapIterableObservable$FlatMapIterableObserver(p0, this.c));
    }
}
