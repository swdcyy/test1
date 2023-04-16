package io.reactivex.internal.operators.observable.ObservablePublishSelector$TargetObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.Object;

public final class ObservablePublishSelector$TargetObserver extends AtomicReference implements y, b	// class@00132e
{
    public final y actual;
    public b d;
    public static final long serialVersionUID = 0xbda68c5ea630de4;

    public void ObservablePublishSelector$TargetObserver(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.d.dispose();
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       DisposableHelper.dispose(this);
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this);
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
