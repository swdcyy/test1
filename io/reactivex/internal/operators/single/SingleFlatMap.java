package io.reactivex.internal.operators.single.SingleFlatMap;
import brd.a0;
import brd.e0;
import erd.o;
import brd.d0;
import io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback;

public final class SingleFlatMap extends a0	// class@001465
{
    public final e0 b;
    public final o c;

    public void SingleFlatMap(e0 p0,o p1){
       super();
       this.c = p1;
       this.b = p0;
    }
    public void S(d0 p0){
       this.b.b(new SingleFlatMap$SingleFlatMapCallback(p0, this.c));
    }
}
