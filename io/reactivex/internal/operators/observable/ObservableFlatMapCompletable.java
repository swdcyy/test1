package io.reactivex.internal.operators.observable.ObservableFlatMapCompletable;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver;

public final class ObservableFlatMapCompletable extends a	// class@001308
{
    public final o c;
    public final boolean d;

    public void ObservableFlatMapCompletable(w p0,o p1,boolean p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableFlatMapCompletable$FlatMapCompletableMainObserver(p0, this.c, this.d));
    }
}
