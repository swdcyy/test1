package io.reactivex.internal.operators.observable.r;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.r$a;
import grd.g;

public final class r extends a	// class@0013fe
{
    public final o c;

    public void r(w p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new r$a(new g(p0), this.c));
    }
}
