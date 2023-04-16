package io.reactivex.internal.operators.observable.z0$a;
import brd.y;
import crd.b;
import erd.o;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import java.lang.Throwable;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

public final class z0$a implements y, b	// class@001440
{
    public final y actual;
    public final o b;
    public final o c;
    public final Callable d;
    public b e;

    public void z0$a(y p0,o p1,o p2,Callable p3){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void dispose(){
       this.e.dispose();
    }
    public boolean isDisposed(){
       return this.e.isDisposed();
    }
    public void onComplete(){
       Object obj = this.d.call();
       a.c(obj, "The onComplete ObservableSource returned is null");
       this.actual.onNext(obj);
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       Object obj = this.c.apply(p0);
       a.c(obj, "The onError ObservableSource returned is null");
       this.actual.onNext(obj);
       this.actual.onComplete();
    }
    public void onNext(Object p0){
       p0 = this.b.apply(p0);
       a.c(p0, "The onNext ObservableSource returned is null");
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.e, p0)) {
          this.e = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
