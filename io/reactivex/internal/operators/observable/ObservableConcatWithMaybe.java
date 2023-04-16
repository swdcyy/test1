package io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.q;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe$ConcatWithObserver;

public final class ObservableConcatWithMaybe extends a	// class@0012fb
{
    public final q c;

    public void ObservableConcatWithMaybe(t p0,q p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableConcatWithMaybe$ConcatWithObserver(p0, this.c));
    }
}
