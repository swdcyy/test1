package io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.e0;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle$ConcatWithObserver;

public final class ObservableConcatWithSingle extends a	// class@0012fd
{
    public final e0 c;

    public void ObservableConcatWithSingle(t p0,e0 p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableConcatWithSingle$ConcatWithObserver(p0, this.c));
    }
}
