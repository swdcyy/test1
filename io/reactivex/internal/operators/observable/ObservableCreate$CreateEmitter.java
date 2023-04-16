package io.reactivex.internal.operators.observable.ObservableCreate$CreateEmitter;
import brd.v;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.y;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.NullPointerException;
import java.lang.String;
import io.reactivex.internal.operators.observable.ObservableCreate$SerializedEmitter;
import erd.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import java.lang.Class;

public final class ObservableCreate$CreateEmitter extends AtomicReference implements v, b	// class@0012fe
{
    public final y observer;
    public static final long serialVersionUID = 0xd055223086a14aa5;

    public void ObservableCreate$CreateEmitter(y p0){
       super();
       this.observer = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       if (!this.isDisposed()) {
          this.observer.onComplete();
          this.dispose();
       }
       return;
    }
    public void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (p0 == null) {
          this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          return;
       }else if(!this.isDisposed()){
          this.observer.onNext(p0);
       }
       return;
    }
    public v serialize(){
       return new ObservableCreate$SerializedEmitter(this);
    }
    public void setCancellable(f p0){
       this.setDisposable(new CancellableDisposable(p0));
    }
    public void setDisposable(b p0){
       DisposableHelper.set(this, p0);
    }
    public String toString(){
       Object[] objArray = new Object[]{ObservableCreate$CreateEmitter.class.getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
    public boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       if (p0 == null) {
          nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       }
       if (!this.isDisposed()) {
          this.observer.onError(nullPointerE);
          this.dispose();
          return true;
       }else {
          return false;
       }
    }
}
