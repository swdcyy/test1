package io.reactivex.internal.operators.observable.f;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import erd.r;
import brd.d0;
import io.reactivex.internal.operators.observable.f$a;
import brd.y;
import brd.t;
import io.reactivex.internal.operators.observable.e;
import ird.a;

public final class f extends a0 implements d	// class@0013bb
{
    public final w b;
    public final r c;

    public void f(w p0,r p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.subscribe(new f$a(p0, this.c));
    }
    public t c(){
       return a.h(new e(this.b, this.c));
    }
}
