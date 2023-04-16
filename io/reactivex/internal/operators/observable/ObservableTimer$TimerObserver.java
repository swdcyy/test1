package io.reactivex.internal.operators.observable.ObservableTimer$TimerObserver;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.y;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Long;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableTimer$TimerObserver extends AtomicReference implements b, Runnable	// class@0018c4
{
    public final y actual;
    public static final long serialVersionUID = 0xd902bd31a5e97959;

    public void ObservableTimer$TimerObserver(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void run(){
       if (!this.isDisposed()) {
          this.actual.onNext(Long.valueOf(0));
          this.lazySet(EmptyDisposable.INSTANCE);
          this.actual.onComplete();
       }
       return;
    }
    public void setResource(b p0){
       DisposableHelper.trySet(this, p0);
    }
}
