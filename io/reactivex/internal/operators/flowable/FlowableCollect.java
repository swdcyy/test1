package io.reactivex.internal.operators.flowable.FlowableCollect;
import io.reactivex.internal.operators.flowable.a;
import brd.h;
import java.util.concurrent.Callable;
import erd.b;
import cxd.c;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.FlowableCollect$CollectSubscriber;
import brd.k;
import java.lang.Throwable;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class FlowableCollect extends a	// class@001216
{
    public final Callable d;
    public final b e;

    public void FlowableCollect(h p0,Callable p1,b p2){
       super(p0);
       this.d = p1;
       this.e = p2;
    }
    public void D(c p0){
       Object obj = this.d.call();
       a.c(obj, "The initial value supplied is null");
       this.c.C(new FlowableCollect$CollectSubscriber(p0, obj, this.e));
    }
}
