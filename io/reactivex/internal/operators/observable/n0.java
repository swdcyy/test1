package io.reactivex.internal.operators.observable.n0;
import brd.t;
import cxd.b;
import brd.y;
import io.reactivex.internal.operators.observable.n0$a;
import cxd.c;

public final class n0 extends t	// class@0013e2
{
    public final b b;

    public void n0(b p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new n0$a(p0));
    }
}
