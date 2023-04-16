package io.reactivex.internal.operators.observable.g;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.r;
import brd.y;
import io.reactivex.internal.operators.observable.g$a;

public final class g extends a	// class@0013bf
{
    public final r c;

    public void g(w p0,r p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new g$a(p0, this.c));
    }
}
