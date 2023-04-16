package io.reactivex.internal.operators.observable.i0;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.i0$a;

public final class i0 extends a	// class@0013c5
{
    public final o c;

    public void i0(w p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new i0$a(p0, this.c));
    }
}
