package io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver;
import crd.b;

public final class ObservableTakeUntil extends a	// class@001376
{
    public final w c;

    public void ObservableTakeUntil(w p0,w p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       ObservableTakeUntil$TakeUntilMainObserver takeUntilMai = new ObservableTakeUntil$TakeUntilMainObserver(p0);
       p0.onSubscribe(takeUntilMai);
       this.c.subscribe(takeUntilMai.otherObserver);
       this.b.subscribe(takeUntilMai);
    }
}
