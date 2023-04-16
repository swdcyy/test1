package io.reactivex.internal.operators.observable.l1;
import brd.a0;
import brd.w;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.observable.l1$a;
import brd.y;

public final class l1 extends a0	// class@0013d4
{
    public final w b;
    public final Object c;

    public void l1(w p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.subscribe(new l1$a(p0, this.c));
    }
}
