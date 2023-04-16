package io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver;
import brd.d0;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import brd.y;
import crd.b;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class SingleToObservable$SingleToObservableObserver extends DeferredScalarDisposable implements d0	// class@00147c
{
    public b d;
    public static final long serialVersionUID = 0x348c813e921c2851;

    public void SingleToObservable$SingleToObservableObserver(y p0){
       super(p0);
    }
    public void dispose(){
       super.dispose();
       this.d.dispose();
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
