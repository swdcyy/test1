package io.reactivex.internal.operators.flowable.FlowableToList;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import java.util.concurrent.Callable;
import cxd.c;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import io.reactivex.internal.operators.flowable.FlowableToList$ToListSubscriber;
import brd.k;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class FlowableToList extends a	// class@001264
{
    public final Callable d;

    public void FlowableToList(h p0,Callable p1){
       super(p0);
       this.d = p1;
    }
    public void D(c p0){
       Object obj = this.d.call();
       a.c(obj, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
       this.c.C(new FlowableToList$ToListSubscriber(p0, obj));
    }
}
