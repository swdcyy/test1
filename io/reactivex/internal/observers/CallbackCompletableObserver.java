package io.reactivex.internal.observers.CallbackCompletableObserver;
import brd.d;
import crd.b;
import erd.g;
import grd.e;
import java.util.concurrent.atomic.AtomicReference;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import drd.a;

public final class CallbackCompletableObserver extends AtomicReference implements d, b, g, e	// class@0011da
{
    public final a onComplete;
    public final g onError;
    public static final long serialVersionUID = 0xc37999502f055a56;

    public void CallbackCompletableObserver(a p0){
       super();
       this.onError = this;
       this.onComplete = p0;
    }
    public void CallbackCompletableObserver(g p0,a p1){
       super();
       this.onError = p0;
       this.onComplete = p1;
    }
    public void accept(Object p0){
       this.accept(p0);
    }
    public void accept(Throwable p0){
       a.l(new OnErrorNotImplementedException(p0));
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean hasCustomOnError(){
       boolean b = (this.onError != this)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       this.onComplete.run();
       this.lazySet(DisposableHelper.DISPOSED);
       return;
    }
    public void onError(Throwable p0){
       this.onError.accept(p0);
       this.lazySet(DisposableHelper.DISPOSED);
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
