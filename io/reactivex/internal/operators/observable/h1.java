package io.reactivex.internal.operators.observable.h1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.c;
import brd.y;
import io.reactivex.internal.operators.observable.h1$a;

public final class h1 extends a	// class@0013c2
{
    public final c c;

    public void h1(w p0,c p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new h1$a(p0, this.c));
    }
}
