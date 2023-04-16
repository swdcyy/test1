package io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.a;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableDoFinally$DoFinallyObserver;

public final class ObservableDoFinally extends a	// class@001305
{
    public final a c;

    public void ObservableDoFinally(w p0,a p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableDoFinally$DoFinallyObserver(p0, this.c));
    }
}
