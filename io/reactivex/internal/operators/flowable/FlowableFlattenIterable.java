package io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import erd.o;
import cxd.c;
import java.util.concurrent.Callable;
import java.lang.Object;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.lang.Iterable;
import java.util.Iterator;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber;
import brd.k;

public final class FlowableFlattenIterable extends a	// class@001231
{
    public final o d;
    public final int e;

    public void FlowableFlattenIterable(h p0,o p1,int p2){
       super(p0);
       this.d = p1;
       this.e = p2;
    }
    public void D(c p0){
       a tc = this.c;
       if (tc instanceof Callable) {
          Object obj = tc.call();
          if (obj == null) {
             EmptySubscription.complete(p0);
             return;
          }else {
             FlowableFromIterable.I(p0, this.d.apply(obj).iterator());
             return;
          }
       }else {
          tc.C(new FlowableFlattenIterable$FlattenIterableSubscriber(p0, this.d, this.e));
          return;
       }
    }
}
