package io.reactivex.internal.operators.single.SingleResumeNext$ResumeMainSingleObserver;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e0;
import io.reactivex.internal.observers.o;
import drd.a;
import io.reactivex.exceptions.CompositeException;

public final class SingleResumeNext$ResumeMainSingleObserver extends AtomicReference implements d0, b	// class@00146e
{
    public final d0 actual;
    public final o nextFunction;
    public static final long serialVersionUID = 0xb63ef761c0022ddb;

    public void SingleResumeNext$ResumeMainSingleObserver(d0 p0,o p1){
       super();
       this.actual = p0;
       this.nextFunction = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onError(Throwable p0){
       Object obj = this.nextFunction.apply(p0);
       a.c(obj, "The nextFunction returned a null SingleSource.");
       obj.b(new o(this, this.actual));
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
