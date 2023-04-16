package io.reactivex.internal.operators.flowable.FlowableReduce;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.c;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableReduce$ReduceSubscriber;
import brd.k;

public final class FlowableReduce extends a	// class@00124e
{
    public final c d;

    public void FlowableReduce(h p0,c p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       this.c.C(new FlowableReduce$ReduceSubscriber(p0, this.d));
    }
}
