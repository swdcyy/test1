package io.reactivex.internal.operators.observable.d1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.d1$a;

public final class d1 extends a	// class@0013af
{
    public final o c;

    public void d1(w p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new d1$a(p0, this.c));
    }
}
