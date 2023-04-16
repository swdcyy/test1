package io.reactivex.internal.operators.observable.s0;
import io.reactivex.internal.fuseable.d;
import brd.a;
import brd.w;
import brd.t;
import io.reactivex.internal.operators.observable.r0;
import ird.a;
import brd.d;
import io.reactivex.internal.operators.observable.s0$a;
import brd.y;

public final class s0 extends a implements d	// class@001400
{
    public final w b;

    public void s0(w p0){
       super();
       this.b = p0;
    }
    public t c(){
       return a.h(new r0(this.b));
    }
    public void v(d p0){
       this.b.subscribe(new s0$a(p0));
    }
}
