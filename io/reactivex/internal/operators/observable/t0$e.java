package io.reactivex.internal.operators.observable.t0$e;
import erd.o;
import erd.c;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.y0;
import io.reactivex.internal.operators.observable.t0$d;

public final class t0$e implements o	// class@00140c
{
    public final c b;
    public final o c;

    public void t0$e(c p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object apply(Object p0){
       Object obj = this.c.apply(p0);
       a.c(obj, "The mapper returned a null ObservableSource");
       return new y0(obj, new t0$d(this.b, p0));
    }
}
