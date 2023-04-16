package io.reactivex.internal.operators.flowable.i;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.r;
import cxd.c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.flowable.i$a;
import brd.k;
import io.reactivex.internal.operators.flowable.i$b;

public final class i extends a	// class@001278
{
    public final r d;

    public void i(h p0,r p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       if (p0 instanceof a) {
          this.c.C(new i$a(p0, this.d));
       }else {
          this.c.C(new i$b(p0, this.d));
       }
       return;
    }
}
