package io.reactivex.internal.operators.maybe.m$a;
import brd.p;
import crd.b;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

public final class m$a implements p, b	// class@0012c1
{
    public final p actual;
    public final o b;
    public b c;

    public void m$a(p p0,o p1){
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
       Object obj = this.b.apply(p0);
       a.c(obj, "The valueSupplier returned a null value");
       this.actual.onSuccess(obj);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
