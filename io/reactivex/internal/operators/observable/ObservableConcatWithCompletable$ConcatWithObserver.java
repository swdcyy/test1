package io.reactivex.internal.operators.observable.ObservableConcatWithCompletable$ConcatWithObserver;
import brd.y;
import brd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.e;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableConcatWithCompletable$ConcatWithObserver extends AtomicReference implements y, d, b	// class@0012f8
{
    public final y actual;
    public boolean inCompletable;
    public e other;
    public static final long serialVersionUID = 0xe4e2f9b100804188;

    public void ObservableConcatWithCompletable$ConcatWithObserver(y p0,e p1){
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
       if (this.inCompletable != null) {
          this.actual.onComplete();
       }else {
          this.inCompletable = true;
          DisposableHelper.replace(this, null);
          ObservableConcatWithCompletable$ConcatWithObserver tother = this.other;
          this.other = null;
          tother.a(this);
       }
       return;
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0) && this.inCompletable == null) {
          this.actual.onSubscribe(this);
       }
       return;
    }
}
