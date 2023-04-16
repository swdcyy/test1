package io.reactivex.internal.operators.observable.ObservableSequenceEqual;
import brd.t;
import brd.w;
import erd.d;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableSequenceEqual$EqualCoordinator;
import crd.b;

public final class ObservableSequenceEqual extends t	// class@001365
{
    public final w b;
    public final w c;
    public final d d;
    public final int e;

    public void ObservableSequenceEqual(w p0,w p1,d p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       ObservableSequenceEqual$EqualCoordinator uEqualCoordi = new ObservableSequenceEqual$EqualCoordinator(p0, this.e, this.b, this.c, this.d);
       p0.onSubscribe(v6);
       v6.subscribe();
    }
}
