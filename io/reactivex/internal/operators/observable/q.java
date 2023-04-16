package io.reactivex.internal.operators.observable.q;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import brd.d0;
import io.reactivex.internal.operators.observable.q$a;
import brd.y;
import brd.t;
import io.reactivex.internal.operators.observable.p;
import ird.a;

public final class q extends a0 implements d	// class@0013f7
{
    public final w b;

    public void q(w p0){
       super();
       this.b = p0;
    }
    public void S(d0 p0){
       this.b.subscribe(new q$a(p0));
    }
    public t c(){
       return a.h(new p(this.b));
    }
}
