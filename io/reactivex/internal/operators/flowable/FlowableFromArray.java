package io.reactivex.internal.operators.flowable.FlowableFromArray;
import brd.h;
import java.lang.Object;
import cxd.c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.flowable.FlowableFromArray$ArrayConditionalSubscription;
import cxd.d;
import io.reactivex.internal.operators.flowable.FlowableFromArray$ArraySubscription;

public final class FlowableFromArray extends h	// class@001235
{
    public final Object[] c;

    public void FlowableFromArray(Object[] p0){
       super();
       this.c = p0;
    }
    public void D(c p0){
       if (p0 instanceof a) {
          p0.onSubscribe(new FlowableFromArray$ArrayConditionalSubscription(p0, this.c));
       }else {
          p0.onSubscribe(new FlowableFromArray$ArraySubscription(p0, this.c));
       }
       return;
    }
}
