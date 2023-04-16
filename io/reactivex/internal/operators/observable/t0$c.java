package io.reactivex.internal.operators.observable.t0$c;
import erd.o;
import java.lang.Object;
import io.reactivex.internal.operators.observable.m0;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Iterable;

public final class t0$c implements o	// class@00140a
{
    public final o b;

    public void t0$c(o p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       p0 = this.b.apply(p0);
       a.c(p0, "The mapper returned a null Iterable");
       return new m0(p0);
    }
}
