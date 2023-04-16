package io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver;
import brd.d0;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver extends AtomicReference implements d0	// class@001475
{
    public final d0 actual;
    public static final long serialVersionUID = 0x1cbf0c2cc84a0325;

    public void SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver(d0 p0){
       super();
       this.actual = p0;
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
