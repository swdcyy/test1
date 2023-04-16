package io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import brd.a;
import brd.e0;
import erd.o;
import brd.d;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable$FlatMapCompletableObserver;
import crd.b;
import brd.d0;

public final class SingleFlatMapCompletable extends a	// class@001467
{
    public final e0 b;
    public final o c;

    public void SingleFlatMapCompletable(e0 p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void v(d p0){
       SingleFlatMapCompletable$FlatMapCompletableObserver uFlatMapComp = new SingleFlatMapCompletable$FlatMapCompletableObserver(p0, this.c);
       p0.onSubscribe(uFlatMapComp);
       this.b.b(uFlatMapComp);
    }
}
