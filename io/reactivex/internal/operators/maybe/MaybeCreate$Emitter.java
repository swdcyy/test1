package io.reactivex.internal.operators.maybe.MaybeCreate$Emitter;
import brd.o;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.p;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.NullPointerException;
import java.lang.String;
import erd.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import java.lang.Class;

public final class MaybeCreate$Emitter extends AtomicReference implements o, b	// class@001291
{
    public final p actual;
    public static final long serialVersionUID = 0xddc22e67dcc87e5c;

    public void MaybeCreate$Emitter(p p0){
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
    public void onSuccess(Object p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.get() != dISPOSED) {
          b andSet = this.getAndSet(dISPOSED);
          if (andSet != dISPOSED) {
             if (p0 == null) {
                this.actual.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
             }else {
                this.actual.onSuccess(p0);
             }
             if (andSet != null) {
                andSet.dispose();
             }
          }
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
       Object[] objArray = new Object[]{MaybeCreate$Emitter.class.getSimpleName(),super.toString()};
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
