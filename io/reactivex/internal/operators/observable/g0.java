package io.reactivex.internal.operators.observable.g0;
import brd.t;
import java.util.concurrent.Callable;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class g0 extends t	// class@0013bd
{
    public final Callable b;

    public void g0(Callable p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       Object obj = this.b.call();
       a.c(obj, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
       EmptyDisposable.error(obj, p0);
       return;
    }
}
