package io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import brd.a0;
import brd.q;
import erd.o;
import brd.d0;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle$FlatMapMaybeObserver;
import brd.p;

public final class MaybeFlatMapSingle extends a0	// class@00129c
{
    public final q b;
    public final o c;

    public void MaybeFlatMapSingle(q p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.b(new MaybeFlatMapSingle$FlatMapMaybeObserver(p0, this.c));
    }
}
