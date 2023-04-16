package io.reactivex.internal.observers.BiConsumerSingleObserver;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import ird.a;

public final class BiConsumerSingleObserver extends AtomicReference implements d0, b	// class@0011d8
{
    public final b onCallback;
    public static final long serialVersionUID = 0x44996dc9ab295821;

    public void BiConsumerSingleObserver(b p0){
       super();
       this.onCallback = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onError(Throwable p0){
       this.lazySet(DisposableHelper.DISPOSED);
       this.onCallback.accept(null, p0);
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.lazySet(DisposableHelper.DISPOSED);
       this.onCallback.accept(p0, null);
       return;
    }
}
