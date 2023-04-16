package io.reactivex.internal.operators.observable.ObservableReplay$d;
import frd.a;
import brd.t;
import erd.g;
import brd.y;

public final class ObservableReplay$d extends a	// class@001349
{
    public final a b;
    public final t c;

    public void ObservableReplay$d(a p0,t p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void c(g p0){
       this.b.c(p0);
    }
    public void subscribeActual(y p0){
       this.c.subscribe(p0);
    }
}
