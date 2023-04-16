package io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import erd.o;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver;

public final class MaybeOnErrorNext extends a	// class@0012a7
{
    public final o c;
    public final boolean d;

    public void MaybeOnErrorNext(q p0,o p1,boolean p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void A(p p0){
       this.b.b(new MaybeOnErrorNext$OnErrorNextMaybeObserver(p0, this.c, this.d));
    }
}
