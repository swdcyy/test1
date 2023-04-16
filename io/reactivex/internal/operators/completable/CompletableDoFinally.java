package io.reactivex.internal.operators.completable.CompletableDoFinally;
import brd.a;
import brd.e;
import erd.a;
import brd.d;
import io.reactivex.internal.operators.completable.CompletableDoFinally$DoFinallyObserver;

public final class CompletableDoFinally extends a	// class@0011f6
{
    public final e b;
    public final a c;

    public void CompletableDoFinally(e p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void v(d p0){
       this.b.a(new CompletableDoFinally$DoFinallyObserver(p0, this.c));
    }
}
