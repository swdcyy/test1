package io.reactivex.internal.operators.completable.CompletableCreate$Emitter;
import brd.c;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.d;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import erd.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import java.lang.String;
import java.lang.Class;
import java.lang.NullPointerException;

public final class CompletableCreate$Emitter extends AtomicReference implements c, b	// class@0011f3
{
    public final d actual;
    public static final long serialVersionUID = 0xddc22e67dcc87e5c;

    public void CompletableCreate$Emitter(d p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          b andSet = this.getAndSet(dISPOSED);
          if (andSet != dISPOSED) {
             this.actual.onComplete();
             if (andSet != null) {
                andSet.dispose();
             }
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          a.l(p0);
       }
       return;
    }
    public void setCancellable(f p0){
       this.setDisposable(new CancellableDisposable(p0));
    }
    public void setDisposable(b p0){
       DisposableHelper.set(this, p0);
    }
    public String toString(){
       Object[] objArray = new Object[]{CompletableCreate$Emitter.class.getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
    public boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       if (p0 == null) {
          nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       }
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          b andSet = this.getAndSet(dISPOSED);
          if (andSet != dISPOSED) {
             this.actual.onError(nullPointerE);
             if (andSet != null) {
                andSet.dispose();
             }
             return true;
          }
       }
       return false;
    }
}
