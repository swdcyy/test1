package io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement;
import brd.m;
import brd.q;
import erd.o;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement$FlatMapMaybeObserver;

public final class MaybeFlatMapSingleElement extends m	// class@00129f
{
    public final q b;
    public final o c;

    public void MaybeFlatMapSingleElement(q p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(p p0){
       this.b.b(new MaybeFlatMapSingleElement$FlatMapMaybeObserver(p0, this.c));
    }
}
