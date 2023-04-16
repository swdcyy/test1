package io.reactivex.internal.operators.observable.d1$a;
import brd.y;
import crd.b;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.String;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

public final class d1$a implements y, b	// class@0013ae
{
    public final y actual;
    public final o b;
    public b c;

    public void d1$a(y p0,o p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       NullPointerException obj = this.b.apply(p0);
       if (obj == null) {
          obj = new NullPointerException("The supplied value is null");
          obj.initCause(p0);
          this.actual.onError(obj);
          return;
       }else {
          this.actual.onNext(obj);
          this.actual.onComplete();
          return;
       }
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
