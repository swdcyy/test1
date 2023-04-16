package io.reactivex.internal.operators.observable.ObservableDebounceTimed$a;
import brd.y;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter;
import java.lang.Throwable;
import ird.a;
import java.lang.Runnable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableDebounceTimed$a implements y, b	// class@001302
{
    public final y actual;
    public final long b;
    public final TimeUnit c;
    public final z$c d;
    public b e;
    public b f;
    public long g;
    public boolean h;

    public void ObservableDebounceTimed$a(y p0,long p1,TimeUnit p2,z$c p3){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void dispose(){
       this.e.dispose();
       this.d.dispose();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       if (this.h != null) {
          return;
       }
       this.h = true;
       ObservableDebounceTimed$a tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       if (tf != null) {
          tf.run();
       }
       this.actual.onComplete();
       this.d.dispose();
       return;
    }
    public void onError(Throwable p0){
       if (this.h != null) {
          a.l(p0);
          return;
       }else {
          ObservableDebounceTimed$a tf = this.f;
          if (tf != null) {
             tf.dispose();
          }
          this.h = true;
          this.actual.onError(p0);
          this.d.dispose();
          return;
       }
    }
    public void onNext(Object p0){
       if (this.h != null) {
          return;
       }
       long l = this.g + 1;
       this.g = l;
       ObservableDebounceTimed$a tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       ObservableDebounceTimed$DebounceEmitter uDebounceEmi = new ObservableDebounceTimed$DebounceEmitter(p0, l, this);
       this.f = uDebounceEmi;
       uDebounceEmi.setResource(this.d.c(uDebounceEmi, this.b, this.c));
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.e, p0)) {
          this.e = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
