package io.reactivex.internal.observers.i;
import brd.d0;
import java.util.concurrent.Future;
import crd.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.c;
import java.util.concurrent.ExecutionException;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ird.a;

public final class i extends CountDownLatch implements d0, Future, b	// class@0011e7
{
    public Object b;
    public Throwable c;
    public final AtomicReference d;

    public void i(){
       super(1);
       this.d = new AtomicReference();
    }
    public boolean cancel(boolean p0){
       while (true) {
          b uob = this.d.get();
          if (uob == this) {
             return false;
          }
          DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
          if (uob == dISPOSED) {
          label_0021 :
             return false;
          }
          if (this.d.compareAndSet(uob, dISPOSED)) {
             if (uob != null) {
                uob.dispose();
                break ;
             }
             break ;
          }
       }
       this.countDown();
       return true;
    }
    public void dispose(){
    }
    public Object get(){
       if (this.getCount()) {
          c.a();
          this.await();
       }
       if (!this.isCancelled()) {
          i tc = this.c;
          if (tc == null) {
             return this.b;
          }else {
             throw new ExecutionException(tc);
          }
       }else {
          throw new CancellationException();
       }
    }
    public Object get(long p0,TimeUnit p1){
       if (this.getCount()) {
          c.a();
          if (!this.await(p0, p1)) {
             throw new TimeoutException();
          }
       }
       if (!this.isCancelled()) {
          i tc = this.c;
          if (tc == null) {
             return this.b;
          }else {
             throw new ExecutionException(tc);
          }
       }else {
          throw new CancellationException();
       }
    }
    public boolean isCancelled(){
       return DisposableHelper.isDisposed(this.d.get());
    }
    public boolean isDisposed(){
       return this.isDone();
    }
    public boolean isDone(){
       boolean b = (!this.getCount())? true: false;
       return b;
    }
    public void onError(Throwable p0){
       while (true) {
          b uob = this.d.get();
          if (uob == DisposableHelper.DISPOSED) {
             a.l(p0);
             return;
          }else {
             this.c = p0;
             if (this.d.compareAndSet(uob, this)) {
                break ;
             }
          }
       }
       this.countDown();
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.d, p0);
    }
    public void onSuccess(Object p0){
       b uob = this.d.get();
       if (uob == DisposableHelper.DISPOSED) {
          return;
       }
       this.b = p0;
       this.d.compareAndSet(uob, this);
       this.countDown();
       return;
    }
}
