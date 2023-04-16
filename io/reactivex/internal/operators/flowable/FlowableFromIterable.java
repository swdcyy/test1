package io.reactivex.internal.operators.flowable.FlowableFromIterable;
import brd.h;
import java.lang.Iterable;
import cxd.c;
import java.util.Iterator;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorConditionalSubscription;
import cxd.d;
import io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorSubscription;
import java.lang.Throwable;
import drd.a;

public final class FlowableFromIterable extends h	// class@001239
{
    public final Iterable c;

    public void FlowableFromIterable(Iterable p0){
       super();
       this.c = p0;
    }
    public static void I(c p0,Iterator p1){
       if (!p1.hasNext()) {
          EmptySubscription.complete(p0);
          return;
       }else if(p0 instanceof a){
          p0.onSubscribe(new FlowableFromIterable$IteratorConditionalSubscription(p0, p1));
       }else {
          p0.onSubscribe(new FlowableFromIterable$IteratorSubscription(p0, p1));
       }
       return;
    }
    public void D(c p0){
       FlowableFromIterable.I(p0, this.c.iterator());
    }
}
