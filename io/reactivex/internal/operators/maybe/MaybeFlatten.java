package io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import erd.o;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver;

public final class MaybeFlatten extends a	// class@0012a2
{
    public final o c;

    public void MaybeFlatten(q p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void A(p p0){
       this.b.b(new MaybeFlatten$FlatMapMaybeObserver(p0, this.c));
    }
}
