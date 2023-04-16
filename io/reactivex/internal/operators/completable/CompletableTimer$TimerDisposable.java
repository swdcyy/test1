package io.reactivex.internal.operators.completable.CompletableTimer$TimerDisposable;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.d;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class CompletableTimer$TimerDisposable extends AtomicReference implements b, Runnable	// class@0011fd
{
    public final d actual;
    public static final long serialVersionUID = 0x2bf44fb13c34d015;

    public void CompletableTimer$TimerDisposable(d p0){
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
       this.actual.onComplete();
    }
    public void setFuture(b p0){
       DisposableHelper.replace(this, p0);
    }
}
