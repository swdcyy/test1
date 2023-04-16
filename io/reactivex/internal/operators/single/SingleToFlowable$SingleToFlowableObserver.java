package io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver;
import brd.d0;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import cxd.c;
import crd.b;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import cxd.d;
import java.lang.Object;

public final class SingleToFlowable$SingleToFlowableObserver extends DeferredScalarSubscription implements d0	// class@00147a
{
    public b d;
    public static final long serialVersionUID = 0x29b22beb2ba33c0;

    public void SingleToFlowable$SingleToFlowableObserver(c p0){
       super(p0);
    }
    public void cancel(){
       super.cancel();
       this.d.dispose();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.complete(p0);
    }
}
