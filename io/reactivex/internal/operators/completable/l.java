package io.reactivex.internal.operators.completable.l;
import brd.t;
import brd.e;
import brd.y;
import io.reactivex.internal.operators.completable.l$a;
import brd.d;

public final class l extends t	// class@001212
{
    public final e b;

    public void l(e p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       this.b.a(new l$a(p0));
    }
}
