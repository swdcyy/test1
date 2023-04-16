package io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.e0;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle$MergeWithObserver;
import crd.b;
import brd.d0;

public final class ObservableMergeWithSingle extends a	// class@001329
{
    public final e0 c;

    public void ObservableMergeWithSingle(t p0,e0 p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       ObservableMergeWithSingle$MergeWithObserver mergeWithObs = new ObservableMergeWithSingle$MergeWithObserver(p0);
       p0.onSubscribe(mergeWithObs);
       this.b.subscribe(mergeWithObs);
       this.c.b(mergeWithObs.otherObserver);
    }
}
