package io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import brd.w;
import brd.y;
import io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableRepeat$RepeatObserver;

public final class ObservableRepeat extends a	// class@001339
{
    public final long c;

    public void ObservableRepeat(t p0,long p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       SequentialDisposable sequentialDi = new SequentialDisposable();
       p0.onSubscribe(sequentialDi);
       ObservableRepeat tc = this.c;
       long l = Long.MAX_VALUE;
       if (tc - l) {
          l = tc - 1;
       }
       ObservableRepeat$RepeatObserver repeatObserv = new ObservableRepeat$RepeatObserver(p0, l, sequentialDi, this.b);
       v6.subscribeNext();
       return;
    }
}
