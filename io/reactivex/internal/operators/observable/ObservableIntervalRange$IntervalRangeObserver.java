package io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.y;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Long;

public final class ObservableIntervalRange$IntervalRangeObserver extends AtomicReference implements b, Runnable	// class@00131d
{
    public final y actual;
    public long count;
    public final long end;
    public static final long serialVersionUID = 0x1a41427056e6124c;

    public void ObservableIntervalRange$IntervalRangeObserver(y p0,long p1,long p2){
       super();
       this.actual = p0;
       this.count = p1;
       this.end = p2;
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
          ObservableIntervalRange$IntervalRangeObserver tcount = this.count;
          this.actual.onNext(Long.valueOf(tcount));
          if (!tcount - this.end) {
             DisposableHelper.dispose(this);
             this.actual.onComplete();
             return;
          }else {
             this.count = tcount + 1;
          }
       }
       return;
    }
    public void setResource(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
