package io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.e;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver;
import crd.b;
import brd.d;

public final class ObservableMergeWithCompletable extends a	// class@001323
{
    public final e c;

    public void ObservableMergeWithCompletable(t p0,e p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       ObservableMergeWithCompletable$MergeWithObserver mergeWithObs = new ObservableMergeWithCompletable$MergeWithObserver(p0);
       p0.onSubscribe(mergeWithObs);
       this.b.subscribe(mergeWithObs);
       this.c.a(mergeWithObs.otherObserver);
    }
}
