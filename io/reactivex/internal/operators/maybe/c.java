package io.reactivex.internal.operators.maybe.c;
import brd.m;
import java.lang.Throwable;
import brd.p;
import crd.b;
import crd.c;

public final class c extends m	// class@0012b2
{
    public final Throwable b;

    public void c(Throwable p0){
       super();
       this.b = p0;
    }
    public void A(p p0){
       p0.onSubscribe(c.a());
       p0.onError(this.b);
    }
}
