package io.reactivex.internal.operators.observable.o1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.r;
import brd.y;
import io.reactivex.internal.operators.observable.o1$a;

public final class o1 extends a	// class@0013ea
{
    public final r c;

    public void o1(w p0,r p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new o1$a(p0, this.c));
    }
}
