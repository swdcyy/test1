package io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToObservableObserver;
import brd.p;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import brd.y;
import crd.b;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class MaybeToObservable$MaybeToObservableObserver extends DeferredScalarDisposable implements p	// class@0012ae
{
    public b d;
    public static final long serialVersionUID = 0x6984808a6f073b2a;

    public void MaybeToObservable$MaybeToObservableObserver(y p0){
       super(p0);
    }
    public void dispose(){
       super.dispose();
       this.d.dispose();
    }
    public void onComplete(){
       this.complete();
    }
    public void onError(Throwable p0){
       this.error(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.complete(p0);
    }
}
