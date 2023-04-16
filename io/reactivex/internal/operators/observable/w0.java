package io.reactivex.internal.operators.observable.w0;
import brd.a0;
import brd.w;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.observable.w0$a;
import brd.y;

public final class w0 extends a0	// class@001429
{
    public final w b;
    public final Object c;

    public void w0(w p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.subscribe(new w0$a(p0, this.c));
    }
}
