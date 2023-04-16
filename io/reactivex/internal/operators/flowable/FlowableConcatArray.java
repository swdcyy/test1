package io.reactivex.internal.operators.flowable.FlowableConcatArray;
import brd.h;
import cxd.b;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableConcatArray$ConcatArraySubscriber;
import cxd.d;

public final class FlowableConcatArray extends h	// class@001218
{
    public final b[] c;
    public final boolean d;

    public void FlowableConcatArray(b[] p0,boolean p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public void D(c p0){
       FlowableConcatArray$ConcatArraySubscriber uConcatArray = new FlowableConcatArray$ConcatArraySubscriber(this.c, this.d, p0);
       p0.onSubscribe(uConcatArray);
       uConcatArray.onComplete();
    }
}
