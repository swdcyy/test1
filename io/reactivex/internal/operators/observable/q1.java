package io.reactivex.internal.operators.observable.q1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.q1$a;

public final class q1 extends a	// class@0013f6
{
    public final long c;

    public void q1(w p0,long p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new q1$a(p0, this.c));
    }
}
