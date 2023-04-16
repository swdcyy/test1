package io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import brd.t;
import brd.e;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable$AndThenObservableObserver;
import crd.b;
import brd.d;

public final class CompletableAndThenObservable extends t	// class@0012c9
{
    public final e b;
    public final w c;

    public void CompletableAndThenObservable(e p0,w p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       CompletableAndThenObservable$AndThenObservableObserver uAndThenObse = new CompletableAndThenObservable$AndThenObservableObserver(p0, this.c);
       p0.onSubscribe(uAndThenObse);
       this.b.a(uAndThenObse);
    }
}
