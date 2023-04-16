package io.reactivex.internal.operators.observable.t1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.r;
import brd.y;
import io.reactivex.internal.operators.observable.t1$a;

public final class t1 extends a	// class@001419
{
    public final r c;

    public void t1(w p0,r p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new t1$a(p0, this.c));
    }
}
