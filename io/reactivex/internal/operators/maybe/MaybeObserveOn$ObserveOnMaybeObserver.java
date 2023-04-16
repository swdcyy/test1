package io.reactivex.internal.operators.maybe.MaybeObserveOn$ObserveOnMaybeObserver;
import brd.p;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.z;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class MaybeObserveOn$ObserveOnMaybeObserver extends AtomicReference implements p, b, Runnable	// class@0012a3
{
    public final p actual;
    public Throwable error;
    public final z scheduler;
    public Object value;
    public static final long serialVersionUID = 0x76f356c87ebda749;

    public void MaybeObserveOn$ObserveOnMaybeObserver(p p0,z p1){
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
    public void onSuccess(Object p0){
       this.value = p0;
       DisposableHelper.replace(this, this.scheduler.d(this));
    }
    public void run(){
       MaybeObserveOn$ObserveOnMaybeObserver terror = this.error;
       Throwable throwable = null;
       if (terror != null) {
          this.error = throwable;
          this.actual.onError(terror);
       }else {
          terror = this.value;
          if (terror != null) {
             this.value = throwable;
             this.actual.onSuccess(terror);
          }else {
             this.actual.onComplete();
          }
       }
       return;
    }
}
