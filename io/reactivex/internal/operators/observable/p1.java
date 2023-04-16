package io.reactivex.internal.operators.observable.p1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.p1$a;
import crd.b;

public final class p1 extends a	// class@0013f0
{
    public final w c;

    public void p1(w p0,w p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       p1$a uoa = new p1$a(p0, this.c);
       p0.onSubscribe(uoa.c);
       this.b.subscribe(uoa);
    }
}
