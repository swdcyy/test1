package io.reactivex.internal.operators.observable.s;
import brd.t;
import java.util.concurrent.Callable;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class s extends t	// class@001403
{
    public final Callable b;

    public void s(Callable p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       Object obj = this.b.call();
       a.c(obj, "null ObservableSource supplied");
       obj.subscribe(p0);
    }
}
