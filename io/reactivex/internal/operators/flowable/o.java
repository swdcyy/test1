package io.reactivex.internal.operators.flowable.o;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.o;
import cxd.c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.flowable.o$a;
import brd.k;
import io.reactivex.internal.operators.flowable.o$b;

public final class o extends a	// class@001282
{
    public final o d;

    public void o(h p0,o p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       if (p0 instanceof a) {
          this.c.C(new o$a(p0, this.d));
       }else {
          this.c.C(new o$b(p0, this.d));
       }
       return;
    }
}
