package io.reactivex.internal.operators.observable.b0;
import io.reactivex.internal.operators.observable.a;
import brd.t;
import erd.g;
import erd.a;
import brd.w;
import brd.y;
import io.reactivex.internal.observers.g;

public final class b0 extends a	// class@0018d2
{
    public final a c;
    public final g onSubscribe;

    public void b0(t p0,g p1,a p2){
       super(p0);
       this.onSubscribe = p1;
       this.c = p2;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new g(p0, this.onSubscribe, this.c));
    }
}
