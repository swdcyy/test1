package io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import io.reactivex.internal.util.g;
import java.lang.Throwable;

public final class ObservableMergeWithCompletable$MergeWithObserver extends AtomicInteger implements y, b	// class@001322
{
    public final y actual;
    public final AtomicThrowable error;
    public final AtomicReference mainDisposable;
    public boolean mainDone;
    public boolean otherDone;
    public final ObservableMergeWithCompletable$MergeWithObserver$OtherObserver otherObserver;
    public static final long serialVersionUID = 0xc042756724718909;

    public void ObservableMergeWithCompletable$MergeWithObserver(y p0){
       super();
       this.actual = p0;
       this.mainDisposable = new AtomicReference();
       this.otherObserver = new ObservableMergeWithCompletable$MergeWithObserver$OtherObserver(this);
       this.error = new AtomicThrowable();
    }
    public void dispose(){
       DisposableHelper.dispose(this.mainDisposable);
       DisposableHelper.dispose(this.otherObserver);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.mainDisposable.get());
    }
    public void onComplete(){
       this.mainDone = true;
       if (this.otherDone != null) {
          g.a(this.actual, this, this.error);
       }
       return;
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this.mainDisposable);
       g.c(this.actual, p0, this, this.error);
    }
    public void onNext(Object p0){
       g.e(this.actual, p0, this, this.error);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.mainDisposable, p0);
    }
    public void otherComplete(){
       this.otherDone = true;
       if (this.mainDone != null) {
          g.a(this.actual, this, this.error);
       }
       return;
    }
    public void otherError(Throwable p0){
       DisposableHelper.dispose(this.mainDisposable);
       g.c(this.actual, p0, this, this.error);
    }
}
