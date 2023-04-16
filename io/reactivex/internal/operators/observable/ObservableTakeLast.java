package io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableTakeLast$TakeLastObserver;

public final class ObservableTakeLast extends a	// class@001371
{
    public final int c;

    public void ObservableTakeLast(w p0,int p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableTakeLast$TakeLastObserver(p0, this.c));
    }
}
