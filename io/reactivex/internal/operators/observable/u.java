package io.reactivex.internal.operators.observable.u;
import brd.t;
import brd.w;
import brd.y;
import io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.u$a;

public final class u extends t	// class@001420
{
    public final w b;
    public final w c;

    public void u(w p0,w p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       SequentialDisposable sequentialDi = new SequentialDisposable();
       p0.onSubscribe(sequentialDi);
       this.c.subscribe(new u$a(this, sequentialDi, p0));
    }
}
