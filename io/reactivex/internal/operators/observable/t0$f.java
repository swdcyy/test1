package io.reactivex.internal.operators.observable.t0$f;
import erd.o;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.q1;
import io.reactivex.internal.functions.Functions;
import brd.t;

public final class t0$f implements o	// class@00140d
{
    public final o b;

    public void t0$f(o p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       Object obj = this.b.apply(p0);
       a.c(obj, "The itemDelay returned a null ObservableSource");
       q1 oq1 = new q1(obj, 1);
       return oq1.map(Functions.g(p0)).defaultIfEmpty(p0);
    }
}
