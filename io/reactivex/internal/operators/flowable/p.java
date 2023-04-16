package io.reactivex.internal.operators.flowable.p;
import io.reactivex.internal.fuseable.h;
import io.reactivex.internal.fuseable.b;
import brd.m;
import brd.h;
import erd.c;
import brd.p;
import io.reactivex.internal.operators.flowable.p$a;
import brd.k;
import cxd.b;
import io.reactivex.internal.operators.flowable.FlowableReduce;
import ird.a;

public final class p extends m implements h, b	// class@001284
{
    public final h b;
    public final c c;

    public void p(h p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(p p0){
       this.b.C(new p$a(p0, this.c));
    }
    public b a(){
       return this.b;
    }
    public h d(){
       return a.f(new FlowableReduce(this.b, this.c));
    }
}
