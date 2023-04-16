package io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver;

public final class ObservableFlatMapMaybe extends a	// class@00130e
{
    public final o c;
    public final boolean d;

    public void ObservableFlatMapMaybe(w p0,o p1,boolean p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableFlatMapMaybe$FlatMapMaybeObserver(p0, this.c, this.d));
    }
}
