package io.reactivex.internal.operators.observable.h;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import erd.r;
import brd.d0;
import io.reactivex.internal.operators.observable.h$a;
import brd.y;
import brd.t;
import io.reactivex.internal.operators.observable.g;
import ird.a;

public final class h extends a0 implements d	// class@0013c3
{
    public final w b;
    public final r c;

    public void h(w p0,r p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.subscribe(new h$a(p0, this.c));
    }
    public t c(){
       return a.h(new g(this.b, this.c));
    }
}
