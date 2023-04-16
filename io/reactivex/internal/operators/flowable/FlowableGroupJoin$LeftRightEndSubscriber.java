package io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber;
import brd.k;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.l;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.lang.Object;
import cxd.d;
import java.lang.Throwable;

public final class FlowableGroupJoin$LeftRightEndSubscriber extends AtomicReference implements k, b	// class@00123a
{
    public final int index;
    public final boolean isLeft;
    public final l parent;
    public static final long serialVersionUID = 0x1a24ec53e2780a15;

    public void FlowableGroupJoin$LeftRightEndSubscriber(l p0,boolean p1,int p2){
       super();
       this.parent = p0;
       this.isLeft = p1;
       this.index = p2;
    }
    public void dispose(){
       SubscriptionHelper.cancel(this);
    }
    public boolean isDisposed(){
       return SubscriptionHelper.isCancelled(this.get());
    }
    public void onComplete(){
       this.parent.a(this.isLeft, this);
    }
    public void onError(Throwable p0){
       this.parent.innerCloseError(p0);
    }
    public void onNext(Object p0){
       if (SubscriptionHelper.cancel(this)) {
          this.parent.a(this.isLeft, this);
       }
       return;
    }
    public void onSubscribe(d p0){
       SubscriptionHelper.setOnce(this, p0, Long.MAX_VALUE);
    }
}
