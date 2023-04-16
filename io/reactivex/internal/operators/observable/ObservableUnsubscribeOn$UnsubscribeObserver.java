package io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.z;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$a;
import java.lang.Runnable;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableUnsubscribeOn$UnsubscribeObserver extends AtomicBoolean implements y, b	// class@001385
{
    public final y actual;
    public b s;
    public final z scheduler;
    public static final long serialVersionUID = 0xe16dfcddd56a9f0;

    public void ObservableUnsubscribeOn$UnsubscribeObserver(y p0,z p1){
       super();
       this.actual = p0;
       this.scheduler = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.scheduler.d(new ObservableUnsubscribeOn$UnsubscribeObserver$a(this));
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
    public void onComplete(){
       if (!this.get()) {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.get()) {
          a.l(p0);
          return;
       }else {
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (!this.get()) {
          this.actual.onNext(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
