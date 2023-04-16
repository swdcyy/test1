package io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableTimeout$a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$b;
import java.lang.Throwable;
import ird.a;

public final class ObservableTimeout$TimeoutConsumer extends AtomicReference implements y, b	// class@001379
{
    public final long idx;
    public final ObservableTimeout$a parent;
    public static final long serialVersionUID = 0x78db4ef70799ee01;

    public void ObservableTimeout$TimeoutConsumer(long p0,ObservableTimeout$a p1){
       super();
       this.idx = p0;
       this.parent = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          this.lazySet(dISPOSED);
          this.parent.onTimeout(this.idx);
       }
       return;
    }
    public void onError(Throwable p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          this.lazySet(dISPOSED);
          this.parent.onTimeoutError(this.idx, p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       p0 = this.get();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (p0 != dISPOSED) {
          p0.dispose();
          this.lazySet(dISPOSED);
          this.parent.onTimeout(this.idx);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
