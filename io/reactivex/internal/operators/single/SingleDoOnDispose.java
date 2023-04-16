package io.reactivex.internal.operators.single.SingleDoOnDispose;
import brd.a0;
import brd.e0;
import erd.a;
import brd.d0;
import io.reactivex.internal.operators.single.SingleDoOnDispose$DoOnDisposeObserver;

public final class SingleDoOnDispose extends a0	// class@001462
{
    public final e0 b;
    public final a c;

    public void SingleDoOnDispose(e0 p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.b(new SingleDoOnDispose$DoOnDisposeObserver(p0, this.c));
    }
}
