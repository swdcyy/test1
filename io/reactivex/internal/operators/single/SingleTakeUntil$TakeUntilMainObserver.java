package io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;

public final class SingleTakeUntil$TakeUntilMainObserver extends AtomicReference implements d0, b	// class@001472
{
    public final d0 actual;
    public final SingleTakeUntil$TakeUntilOtherSubscriber other;
    public static final long serialVersionUID = 0xf75c1121a3b64abb;

    public void SingleTakeUntil$TakeUntilMainObserver(d0 p0){
       super();
       this.actual = p0;
       this.other = new SingleTakeUntil$TakeUntilOtherSubscriber(this);
    }
    public void dispose(){
       DisposableHelper.dispose(this);
       this.other.dispose();
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onError(Throwable p0){
       this.other.dispose();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED && this.getAndSet(dISPOSED) != dISPOSED) {
          this.actual.onError(p0);
          return;
       }else {
          a.l(p0);
          return;
       }
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.other.dispose();
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.getAndSet(dISPOSED) != dISPOSED) {
          this.actual.onSuccess(p0);
       }
       return;
    }
    public void otherError(Throwable p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          b andSet = this.getAndSet(dISPOSED);
          if (andSet != dISPOSED) {
             if (andSet != null) {
                andSet.dispose();
             }
             this.actual.onError(p0);
             return;
          }
       }
       a.l(p0);
       return;
    }
}
