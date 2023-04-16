package io.reactivex.internal.observers.ConsumerSingleObserver;
import brd.d0;
import crd.b;
import grd.e;
import java.util.concurrent.atomic.AtomicReference;
import erd.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import ird.a;

public final class ConsumerSingleObserver extends AtomicReference implements d0, b, e	// class@0011db
{
    public final g onError;
    public final g onSuccess;
    public static final long serialVersionUID = 0x9eb00eea81aa343d;

    public void ConsumerSingleObserver(g p0,g p1){
       super();
       this.onSuccess = p0;
       this.onError = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean hasCustomOnError(){
       boolean b = (this.onError != Functions.f)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onError(Throwable p0){
       this.lazySet(DisposableHelper.DISPOSED);
       this.onError.accept(p0);
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.lazySet(DisposableHelper.DISPOSED);
       this.onSuccess.accept(p0);
       return;
    }
}
