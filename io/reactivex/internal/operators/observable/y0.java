package io.reactivex.internal.operators.observable.y0;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.y0$a;

public final class y0 extends a	// class@00191d
{
    public final o c;

    public void y0(w p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new y0$a(p0, this.c));
    }
}
