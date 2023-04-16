package io.reactivex.internal.operators.maybe.MaybeDoFinally;
import io.reactivex.internal.operators.maybe.a;
import brd.q;
import erd.a;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeDoFinally$DoFinallyObserver;

public final class MaybeDoFinally extends a	// class@001299
{
    public final a c;

    public void MaybeDoFinally(q p0,a p1){
       super(p0);
       this.c = p1;
    }
    public void A(p p0){
       this.b.b(new MaybeDoFinally$DoFinallyObserver(p0, this.c));
    }
}
