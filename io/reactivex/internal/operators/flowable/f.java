package io.reactivex.internal.operators.flowable.f;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.g;
import erd.q;
import erd.a;
import cxd.c;
import io.reactivex.internal.operators.flowable.f$a;
import brd.k;

public final class f extends a	// class@001272
{
    public final q d;
    public final a e;
    public final g onSubscribe;

    public void f(h p0,g p1,q p2,a p3){
       super(p0);
       this.onSubscribe = p1;
       this.d = p2;
       this.e = p3;
    }
    public void D(c p0){
       this.c.C(new f$a(p0, this.onSubscribe, this.d, this.e));
    }
}
