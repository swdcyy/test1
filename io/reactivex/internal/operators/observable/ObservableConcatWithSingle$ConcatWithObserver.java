package io.reactivex.internal.operators.observable.ObservableConcatWithSingle$ConcatWithObserver;
import brd.y;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.e0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableConcatWithSingle$ConcatWithObserver extends AtomicReference implements y, d0, b	// class@0012fc
{
    public final y actual;
    public boolean inSingle;
    public e0 other;
    public static final long serialVersionUID = 0xe4e2f9b100804188;

    public void ObservableConcatWithSingle$ConcatWithObserver(y p0,e0 p1){
       super();
       this.actual = p0;
       this.other = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.inSingle = true;
       DisposableHelper.replace(this, null);
       ObservableConcatWithSingle$ConcatWithObserver tother = this.other;
       this.other = null;
       tother.b(this);
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0) && this.inSingle == null) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onNext(p0);
       this.actual.onComplete();
    }
}
