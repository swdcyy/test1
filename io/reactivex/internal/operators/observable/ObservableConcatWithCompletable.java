package io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.e;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable$ConcatWithObserver;

public final class ObservableConcatWithCompletable extends a	// class@0012f9
{
    public final e c;

    public void ObservableConcatWithCompletable(t p0,e p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableConcatWithCompletable$ConcatWithObserver(p0, this.c));
    }
}
