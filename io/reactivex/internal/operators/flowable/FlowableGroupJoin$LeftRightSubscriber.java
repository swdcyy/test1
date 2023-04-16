package io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber;
import brd.k;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.l;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Object;
import cxd.d;
import java.lang.Throwable;

public final class FlowableGroupJoin$LeftRightSubscriber extends AtomicReference implements k, b	// class@00123b
{
    public final boolean isLeft;
    public final l parent;
    public static final long serialVersionUID = 0x1a24ec53e2780a15;

    public void FlowableGroupJoin$LeftRightSubscriber(l p0,boolean p1){
       super();
       this.parent = p0;
       this.isLeft = p1;
    }
    public void dispose(){
       SubscriptionHelper.cancel(this);
    }
    public boolean isDisposed(){
       return SubscriptionHelper.isCancelled(this.get());
    }
    public void onComplete(){
       this.parent.b(this);
    }
    public void onError(Throwable p0){
       this.parent.innerError(p0);
    }
    public void onNext(Object p0){
       this.parent.innerValue(this.isLeft, p0);
    }
    public void onSubscribe(d p0){
       SubscriptionHelper.setOnce(this, p0, Long.MAX_VALUE);
    }
}
