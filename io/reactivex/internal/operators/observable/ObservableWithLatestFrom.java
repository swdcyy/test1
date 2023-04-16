package io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.c;
import brd.y;
import grd.g;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom$a;

public final class ObservableWithLatestFrom extends a	// class@001394
{
    public final c c;
    public final w d;

    public void ObservableWithLatestFrom(w p0,c p1,w p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       g og = new g(p0);
       ObservableWithLatestFrom$WithLatestFromObserver withLatestFr = new ObservableWithLatestFrom$WithLatestFromObserver(og, this.c);
       og.onSubscribe(withLatestFr);
       this.d.subscribe(new ObservableWithLatestFrom$a(this, withLatestFr));
       this.b.subscribe(withLatestFr);
    }
}
