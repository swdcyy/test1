package io.reactivex.internal.operators.observable.h0;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.r;
import brd.y;
import io.reactivex.internal.operators.observable.h0$a;

public final class h0 extends a	// class@0018e2
{
    public final r c;

    public void h0(w p0,r p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new h0$a(p0, this.c));
    }
}
