package io.reactivex.internal.operators.single.SingleTimer$TimerDisposable;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.d0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Long;

public final class SingleTimer$TimerDisposable extends AtomicReference implements b, Runnable	// class@001478
{
    public final d0 actual;
    public static final long serialVersionUID = 0x757b2623468f669a;

    public void SingleTimer$TimerDisposable(d0 p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void run(){
       this.actual.onSuccess(Long.valueOf(0));
    }
    public void setFuture(b p0){
       DisposableHelper.replace(this, p0);
    }
}
