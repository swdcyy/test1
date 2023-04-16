package io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.a;
import cxd.c;
import erd.o;
import brd.k;
import io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber;
import cxd.b;
import io.reactivex.internal.operators.flowable.r;
import brd.h;

public final class FlowableFlatMap extends a	// class@00122f
{
    public final o d;
    public final boolean e;
    public final int f;
    public final int g;

    public static k I(c p0,o p1,boolean p2,int p3,int p4){
       FlowableFlatMap$MergeSubscriber mergeSubscri = new FlowableFlatMap$MergeSubscriber(p0, p1, p2, p3, p4);
       return v6;
    }
    public void D(c p0){
       if (r.a(this.c, p0, this.d)) {
          return;
       }
       this.c.C(FlowableFlatMap.I(p0, this.d, this.e, this.f, this.g));
       return;
    }
}
