package io.reactivex.internal.operators.completable.CompletableObserveOn$ObserveOnCompletableObserver;
import brd.d;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.z;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class CompletableObserveOn$ObserveOnCompletableObserver extends AtomicReference implements d, b, Runnable	// class@0011f9
{
    public final d actual;
    public Throwable error;
    public final z scheduler;
    public static final long serialVersionUID = 0x76f356c87ebda749;

    public void CompletableObserveOn$ObserveOnCompletableObserver(d p0,z p1){
       super();
       this.actual = p0;
       this.scheduler = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       DisposableHelper.replace(this, this.scheduler.d(this));
    }
    public void onError(Throwable p0){
       this.error = p0;
       DisposableHelper.replace(this, this.scheduler.d(this));
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void run(){
       CompletableObserveOn$ObserveOnCompletableObserver terror = this.error;
       if (terror != null) {
          this.error = null;
          this.actual.onError(terror);
       }else {
          this.actual.onComplete();
       }
       return;
    }
}
