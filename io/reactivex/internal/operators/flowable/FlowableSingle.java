package io.reactivex.internal.operators.flowable.FlowableSingle;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import java.lang.Object;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableSingle$SingleElementSubscriber;
import brd.k;

public final class FlowableSingle extends a	// class@00125a
{
    public final Object d;
    public final boolean e;

    public void FlowableSingle(h p0,Object p1,boolean p2){
       super(p0);
       this.d = p1;
       this.e = p2;
    }
    public void D(c p0){
       this.c.C(new FlowableSingle$SingleElementSubscriber(p0, this.d, this.e));
    }
}
