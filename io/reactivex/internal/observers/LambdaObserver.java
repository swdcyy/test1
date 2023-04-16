package io.reactivex.internal.observers.LambdaObserver;
import brd.y;
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

public final class LambdaObserver extends AtomicReference implements y, b, e	// class@001859
{
    public final a onComplete;
    public final g onError;
    public final g onNext;
    public final g onSubscribe;
    public static final long serialVersionUID = 0x9b5ed57b794ea334;

    public void LambdaObserver(g p0,g p1,a p2,g p3){
       super();
       this.onNext = p0;
       this.onError = p1;
       this.onComplete = p2;
       this.onSubscribe = p3;
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
    public void onComplete(){
       if (!this.isDisposed()) {
          this.lazySet(DisposableHelper.DISPOSED);
          this.onComplete.run();
       }
       return;
    }
    public void onError(Throwable p0){
       if (!this.isDisposed()) {
          this.lazySet(DisposableHelper.DISPOSED);
          this.onError.accept(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (!this.isDisposed()) {
          this.onNext.accept(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.onSubscribe.accept(this);
       }
       return;
    }
}
