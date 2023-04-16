package io.reactivex.internal.observers.h;
import brd.y;
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
import java.util.NoSuchElementException;
import java.lang.String;
import ird.a;
import java.lang.IndexOutOfBoundsException;

public final class h extends CountDownLatch implements y, Future, b	// class@0011e6
{
    public Object b;
    public Throwable c;
    public final AtomicReference d;

    public void h(){
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
          h tc = this.c;
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
          h tc = this.c;
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
    public void onComplete(){
       if (this.b == null) {
          this.onError(new NoSuchElementException("The source is empty"));
          return;
       }else {
          b uob = this.d.get();
          while (uob != this && uob != DisposableHelper.DISPOSED) {
             if (this.d.compareAndSet(uob, this)) {
                this.countDown();
                break ;
             }
          }
          return;
       }
    }
    public void onError(Throwable p0){
       if (this.c == null) {
          this.c = p0;
          while (true) {
             b uob = this.d.get();
             if (uob == this || uob == DisposableHelper.DISPOSED) {
                a.l(p0);
                return;
             }else if(this.d.compareAndSet(uob, this)){
                break ;
             }
          }
          this.countDown();
          return;
       }else {
          a.l(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.b != null) {
          this.d.get().dispose();
          this.onError(new IndexOutOfBoundsException("More than one element received"));
          return;
       }else {
          this.b = p0;
          return;
       }
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.d, p0);
    }
}
