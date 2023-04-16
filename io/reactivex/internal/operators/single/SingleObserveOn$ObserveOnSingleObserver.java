package io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver;
import brd.d0;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.z;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class SingleObserveOn$ObserveOnSingleObserver extends AtomicReference implements d0, b, Runnable	// class@00146c
{
    public final d0 actual;
    public Throwable error;
    public final z scheduler;
    public Object value;
    public static final long serialVersionUID = 0x30f5fcccee5fcf85;

    public void SingleObserveOn$ObserveOnSingleObserver(d0 p0,z p1){
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
    public void onSuccess(Object p0){
       this.value = p0;
       DisposableHelper.replace(this, this.scheduler.d(this));
    }
    public void run(){
       SingleObserveOn$ObserveOnSingleObserver terror = this.error;
       if (terror != null) {
          this.actual.onError(terror);
       }else {
          this.actual.onSuccess(this.value);
       }
       return;
    }
}
