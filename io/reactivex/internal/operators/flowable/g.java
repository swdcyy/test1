package io.reactivex.internal.operators.flowable.g;
import io.reactivex.internal.fuseable.b;
import brd.a0;
import brd.h;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.flowable.g$a;
import brd.k;
import io.reactivex.internal.operators.flowable.FlowableElementAt;
import ird.a;

public final class g extends a0 implements b	// class@001274
{
    public final h b;
    public final long c;
    public final Object d;

    public void g(h p0,long p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void S(d0 p0){
       this.b.C(new g$a(p0, this.c, this.d));
    }
    public h d(){
       FlowableElementAt uFlowableEle = new FlowableElementAt(this.b, this.c, this.d, true);
       return a.f(v6);
    }
}
