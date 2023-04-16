package io.reactivex.internal.operators.observable.y;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import erd.d;
import brd.y;
import io.reactivex.internal.operators.observable.y$a;

public final class y extends a	// class@00143e
{
    public final o c;
    public final d d;

    public void y(w p0,o p1,d p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new y$a(p0, this.c, this.d));
    }
}
