package io.reactivex.internal.operators.observable.s1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.r;
import brd.y;
import io.reactivex.internal.operators.observable.s1$a;

public final class s1 extends a	// class@001402
{
    public final r c;

    public void s1(w p0,r p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new s1$a(p0, this.c));
    }
}
