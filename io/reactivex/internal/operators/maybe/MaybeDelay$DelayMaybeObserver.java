package io.reactivex.internal.operators.maybe.MaybeDelay$DelayMaybeObserver;
import brd.p;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class MaybeDelay$DelayMaybeObserver extends AtomicReference implements p, b, Runnable	// class@001293
{
    public final p actual;
    public final long delay;
    public Throwable error;
    public final z scheduler;
    public final TimeUnit unit;
    public Object value;
    public static final long serialVersionUID = 0x4d4175c4cbdbad1c;

    public void MaybeDelay$DelayMaybeObserver(p p0,long p1,TimeUnit p2,z p3){
       super();
       this.actual = p0;
       this.delay = p1;
       this.unit = p2;
       this.scheduler = p3;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.schedule();
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.schedule();
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.value = p0;
       this.schedule();
    }
    public void run(){
       MaybeDelay$DelayMaybeObserver terror = this.error;
       if (terror != null) {
          this.actual.onError(terror);
       }else {
          terror = this.value;
          if (terror != null) {
             this.actual.onSuccess(terror);
          }else {
             this.actual.onComplete();
          }
       }
       return;
    }
    public void schedule(){
       DisposableHelper.replace(this, this.scheduler.e(this, this.delay, this.unit));
    }
}
