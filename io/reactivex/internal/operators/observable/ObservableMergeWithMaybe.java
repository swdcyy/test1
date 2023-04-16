package io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.q;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver;
import crd.b;
import brd.p;

public final class ObservableMergeWithMaybe extends a	// class@001326
{
    public final q c;

    public void ObservableMergeWithMaybe(t p0,q p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       ObservableMergeWithMaybe$MergeWithObserver mergeWithObs = new ObservableMergeWithMaybe$MergeWithObserver(p0);
       p0.onSubscribe(mergeWithObs);
       this.b.subscribe(mergeWithObs);
       this.c.b(mergeWithObs.otherObserver);
    }
}
