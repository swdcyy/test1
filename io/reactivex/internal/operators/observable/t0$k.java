package io.reactivex.internal.operators.observable.t0$k;
import erd.o;
import brd.z;
import java.lang.Object;
import brd.t;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;

public final class t0$k implements o	// class@001412
{
    public final o b;
    public final z c;

    public void t0$k(o p0,z p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object apply(Object p0){
       p0 = this.b.apply(p0);
       a.c(p0, "The selector returned a null ObservableSource");
       return t.wrap(p0).observeOn(this.c);
    }
}
