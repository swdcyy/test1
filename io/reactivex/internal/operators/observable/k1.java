package io.reactivex.internal.operators.observable.k1;
import brd.m;
import brd.w;
import brd.p;
import io.reactivex.internal.operators.observable.k1$a;
import brd.y;

public final class k1 extends m	// class@0013cf
{
    public final w b;

    public void k1(w p0){
       super();
       this.b = p0;
    }
    public void A(p p0){
       this.b.subscribe(new k1$a(p0));
    }
}
