package io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.y;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Long;

public final class ObservableInterval$IntervalObserver extends AtomicReference implements b, Runnable	// class@00131b
{
    public final y actual;
    public long count;
    public static final long serialVersionUID = 0x4cffcf692d13b6f;

    public void ObservableInterval$IntervalObserver(y p0){
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
       if (this.get() != DisposableHelper.DISPOSED) {
          ObservableInterval$IntervalObserver tcount = this.count;
          this.count = 1 + tcount;
          this.actual.onNext(Long.valueOf(tcount));
       }
       return;
    }
    public void setResource(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
