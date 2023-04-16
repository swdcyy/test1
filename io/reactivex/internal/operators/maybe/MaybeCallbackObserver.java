package io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import brd.p;
import crd.b;
import grd.e;
import java.util.concurrent.atomic.AtomicReference;
import erd.g;
import erd.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.exceptions.CompositeException;

public final class MaybeCallbackObserver extends AtomicReference implements p, b, e	// class@001290
{
    public final a onComplete;
    public final g onError;
    public final g onSuccess;
    public static final long serialVersionUID = 0xabaa5414d0791fe6;

    public void MaybeCallbackObserver(g p0,g p1,a p2){
       super();
       this.onSuccess = p0;
       this.onError = p1;
       this.onComplete = p2;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean hasCustomOnError(){
       boolean b = (this.onError != Functions.f)? true: false;
       return b;
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.lazySet(DisposableHelper.DISPOSED);
       this.onComplete.run();
       return;
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
