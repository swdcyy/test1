package grd.f;
import brd.y;
import crd.b;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.Throwable;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class f implements y, b	// class@000f60
{
    public final y actual;
    public b b;
    public boolean c;

    public void f(y p0){
       super();
       this.actual = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       if (this.b == null) {
          this.actual.onSubscribe(EmptyDisposable.INSTANCE);
          this.actual.onError(new NullPointerException("Subscription not set!"));
          return;
       }else {
          this.actual.onComplete();
          return;
       }
    }
    public void onError(Throwable p0){
       NullPointerException nullPointerE;
       if (this.c != null) {
          a.l(p0);
          return;
       }else {
          this.c = true;
          if (this.b == null) {
             this.actual.onSubscribe(EmptyDisposable.INSTANCE);
             Throwable[] throwableArr = new Throwable[]{p0,new NullPointerException("Subscription not set!")};
             this.actual.onError(new CompositeException(throwableArr));
             return;
          }else if(p0 == null){
             nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
          }
          this.actual.onError(nullPointerE);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.c != null) {
          return;
       }
       if (this.b == null) {
          this.c = true;
          this.actual.onSubscribe(EmptyDisposable.INSTANCE);
          this.actual.onError(new NullPointerException("Subscription not set!"));
          return;
       }else if(p0 == null){
          this.b.dispose();
          this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          return;
       }else {
          this.actual.onNext(p0);
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          this.actual.onSubscribe(this);
       }
    label_0032 :
       return;
    }
}
