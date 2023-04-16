package io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import erd.g;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop$BackpressureDropSubscriber;
import brd.k;
import java.lang.Object;

public final class FlowableOnBackpressureDrop extends a implements g	// class@001248
{
    public final g d;

    public void FlowableOnBackpressureDrop(h p0){
       super(p0);
       this.d = this;
    }
    public void D(c p0){
       this.c.C(new FlowableOnBackpressureDrop$BackpressureDropSubscriber(p0, this.d));
    }
    public void accept(Object p0){
    }
}
