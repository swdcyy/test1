package io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import erd.e;
import brd.w;
import brd.y;
import io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil$RepeatUntilObserver;

public final class ObservableRepeatUntil extends a	// class@00133b
{
    public final e c;

    public void ObservableRepeatUntil(t p0,e p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       SequentialDisposable sequentialDi = new SequentialDisposable();
       p0.onSubscribe(sequentialDi);
       new ObservableRepeatUntil$RepeatUntilObserver(p0, this.c, sequentialDi, this.b).subscribeNext();
    }
}
