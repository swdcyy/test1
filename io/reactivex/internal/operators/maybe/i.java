package io.reactivex.internal.operators.maybe.i;
import io.reactivex.internal.fuseable.m;
import brd.m;
import java.lang.Object;
import brd.p;
import crd.b;
import crd.c;

public final class i extends m implements m	// class@0012bb
{
    public final Object b;

    public void i(Object p0){
       super();
       this.b = p0;
    }
    public void A(p p0){
       p0.onSubscribe(c.a());
       p0.onSuccess(this.b);
    }
    public Object call(){
       return this.b;
    }
}
