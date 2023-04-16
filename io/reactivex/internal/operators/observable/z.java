package io.reactivex.internal.operators.observable.z;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.g;
import brd.y;
import io.reactivex.internal.operators.observable.z$a;

public final class z extends a	// class@001444
{
    public final g c;

    public void z(w p0,g p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new z$a(p0, this.c));
    }
}
