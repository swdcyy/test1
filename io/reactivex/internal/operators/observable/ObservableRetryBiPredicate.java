package io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import erd.d;
import brd.w;
import brd.y;
import io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate$RetryBiObserver;

public final class ObservableRetryBiPredicate extends a	// class@001351
{
    public final d c;

    public void ObservableRetryBiPredicate(t p0,d p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       SequentialDisposable sequentialDi = new SequentialDisposable();
       p0.onSubscribe(sequentialDi);
       new ObservableRetryBiPredicate$RetryBiObserver(p0, this.c, sequentialDi, this.b).subscribeNext();
    }
}
