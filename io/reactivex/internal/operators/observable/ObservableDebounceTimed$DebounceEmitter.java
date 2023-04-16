package io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter;
import java.lang.Runnable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed$a;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.disposables.DisposableHelper;
import brd.y;

public final class ObservableDebounceTimed$DebounceEmitter extends AtomicReference implements Runnable, b	// class@001301
{
    public final long idx;
    public final AtomicBoolean once;
    public final ObservableDebounceTimed$a parent;
    public final Object value;
    public static final long serialVersionUID = 0x5e8933e4e0c30cf5;

    public void ObservableDebounceTimed$DebounceEmitter(Object p0,long p1,ObservableDebounceTimed$a p2){
       super();
       this.once = new AtomicBoolean();
       this.value = p0;
       this.idx = p1;
       this.parent = p2;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void run(){
       if (this.once.compareAndSet(false, true)) {
          ObservableDebounceTimed$DebounceEmitter tparent = this.parent;
          ObservableDebounceTimed$DebounceEmitter tvalue = this.value;
          if (!this.idx - tparent.g) {
             tparent.actual.onNext(tvalue);
             this.dispose();
          }
       }
       return;
    }
    public void setResource(b p0){
       DisposableHelper.replace(this, p0);
    }
}
