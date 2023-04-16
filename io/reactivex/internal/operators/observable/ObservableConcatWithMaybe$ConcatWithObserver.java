package io.reactivex.internal.operators.observable.ObservableConcatWithMaybe$ConcatWithObserver;
import brd.y;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.q;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableConcatWithMaybe$ConcatWithObserver extends AtomicReference implements y, p, b	// class@0012fa
{
    public final y actual;
    public boolean inMaybe;
    public q other;
    public static final long serialVersionUID = 0xe4e2f9b100804188;

    public void ObservableConcatWithMaybe$ConcatWithObserver(y p0,q p1){
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
       if (this.inMaybe != null) {
          this.actual.onComplete();
       }else {
          this.inMaybe = true;
          DisposableHelper.replace(this, null);
          ObservableConcatWithMaybe$ConcatWithObserver tother = this.other;
          this.other = null;
          tother.b(this);
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
       if (DisposableHelper.setOnce(this, p0) && this.inMaybe == null) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onNext(p0);
       this.actual.onComplete();
    }
}
