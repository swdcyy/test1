package io.reactivex.internal.operators.flowable.t;
import io.reactivex.internal.fuseable.b;
import brd.a0;
import brd.h;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.flowable.t$a;
import brd.k;
import io.reactivex.internal.operators.flowable.FlowableSingle;
import ird.a;

public final class t extends a0 implements b	// class@001289
{
    public final h b;
    public final Object c;

    public void t(h p0,Object p1){
       super();
       this.b = p0;
       this.c = null;
    }
    public void S(d0 p0){
       this.b.C(new t$a(p0, this.c));
    }
    public h d(){
       return a.f(new FlowableSingle(this.b, this.c, true));
    }
}
