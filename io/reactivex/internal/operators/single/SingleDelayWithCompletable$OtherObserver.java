package io.reactivex.internal.operators.single.SingleDelayWithCompletable$OtherObserver;
import brd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.d0;
import brd.e0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import io.reactivex.internal.observers.o;
import java.lang.Throwable;

public final class SingleDelayWithCompletable$OtherObserver extends AtomicReference implements d, b	// class@00145d
{
    public final d0 actual;
    public final e0 source;
    public static final long serialVersionUID = 0x892208164f72de58;

    public void SingleDelayWithCompletable$OtherObserver(d0 p0,e0 p1){
       super();
       this.actual = p0;
       this.source = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.source.b(new o(this, this.actual));
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
}
