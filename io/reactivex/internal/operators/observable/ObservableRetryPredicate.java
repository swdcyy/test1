package io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import erd.r;
import brd.w;
import brd.y;
import io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate$RepeatObserver;

public final class ObservableRetryPredicate extends a	// class@001353
{
    public final r c;
    public final long d;

    public void ObservableRetryPredicate(t p0,long p1,r p2){
       super(p0);
       this.c = p2;
       this.d = p1;
    }
    public void subscribeActual(y p0){
       SequentialDisposable sequentialDi = new SequentialDisposable();
       p0.onSubscribe(sequentialDi);
       ObservableRetryPredicate$RepeatObserver repeatObserv = new ObservableRetryPredicate$RepeatObserver(p0, this.d, this.c, sequentialDi, this.b);
       v7.subscribeNext();
    }
}
