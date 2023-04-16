package io.reactivex.internal.operators.observable.e0;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.observable.e0$a;
import brd.y;
import brd.t;
import io.reactivex.internal.operators.observable.c0;
import ird.a;

public final class e0 extends a0 implements d	// class@0013b3
{
    public final w b;
    public final long c;
    public final Object d;

    public void e0(w p0,long p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void S(d0 p0){
       this.b.subscribe(new e0$a(p0, this.c, this.d));
    }
    public t c(){
       c0 uoc0 = new c0(this.b, this.c, this.d, true);
       return a.h(v6);
    }
}
