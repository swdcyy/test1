package io.reactivex.internal.operators.observable.d0;
import io.reactivex.internal.fuseable.d;
import brd.m;
import brd.w;
import brd.p;
import io.reactivex.internal.operators.observable.d0$a;
import brd.y;
import brd.t;
import io.reactivex.internal.operators.observable.c0;
import java.lang.Object;
import ird.a;

public final class d0 extends m implements d	// class@0013ad
{
    public final w b;
    public final long c;

    public void d0(w p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(p p0){
       this.b.subscribe(new d0$a(p0, this.c));
    }
    public t c(){
       c0 uoc0 = new c0(this.b, this.c, null, false);
       return a.h(v6);
    }
}
