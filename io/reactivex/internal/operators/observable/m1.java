package io.reactivex.internal.operators.observable.m1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.m1$a;

public final class m1 extends a	// class@0013de
{
    public final long c;

    public void m1(w p0,long p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new m1$a(p0, this.c));
    }
}
