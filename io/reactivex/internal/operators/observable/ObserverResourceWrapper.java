package io.reactivex.internal.operators.observable.ObserverResourceWrapper;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObserverResourceWrapper extends AtomicReference implements y, b	// class@00139c
{
    public final y actual;
    public final AtomicReference subscription;
    public static final long serialVersionUID = 0x887bf399e018e03e;

    public void ObserverResourceWrapper(y p0){
       super();
       this.subscription = new AtomicReference();
       this.actual = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this.subscription);
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.subscription.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       this.dispose();
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.dispose();
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this.subscription, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void setResource(b p0){
       DisposableHelper.set(this, p0);
    }
}
