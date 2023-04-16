package io.reactivex.internal.operators.single.k;
import brd.a0;
import java.lang.Object;
import brd.d0;
import crd.b;
import crd.c;

public final class k extends a0	// class@001495
{
    public final Object b;

    public void k(Object p0){
       super();
       this.b = p0;
    }
    public void S(d0 p0){
       p0.onSubscribe(c.a());
       p0.onSuccess(this.b);
    }
}
