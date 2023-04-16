package io.reactivex.internal.operators.single.SingleDoFinally;
import brd.a0;
import brd.e0;
import erd.a;
import brd.d0;
import io.reactivex.internal.operators.single.SingleDoFinally$DoFinallyObserver;

public final class SingleDoFinally extends a0	// class@001460
{
    public final e0 b;
    public final a c;

    public void SingleDoFinally(e0 p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.b(new SingleDoFinally$DoFinallyObserver(p0, this.c));
    }
}
