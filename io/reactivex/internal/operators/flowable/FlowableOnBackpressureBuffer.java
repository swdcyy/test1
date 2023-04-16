package io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.a;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber;
import brd.k;

public final class FlowableOnBackpressureBuffer extends a	// class@001246
{
    public final int d;
    public final boolean e;
    public final boolean f;
    public final a g;

    public void FlowableOnBackpressureBuffer(h p0,int p1,boolean p2,boolean p3,a p4){
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public void D(c p0){
       FlowableOnBackpressureBuffer$BackpressureBufferSubscriber uBackpressur = new FlowableOnBackpressureBuffer$BackpressureBufferSubscriber(p0, this.d, this.e, this.f, this.g);
       this.c.C(v7);
    }
}
