package io.reactivex.internal.operators.observable.n;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.Callable;
import erd.b;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.n$a;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class n extends a	// class@0013e6
{
    public final Callable c;
    public final b d;

    public void n(w p0,Callable p1,b p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       Object obj = this.c.call();
       a.c(obj, "The initialSupplier returned a null value");
       this.b.subscribe(new n$a(p0, obj, this.d));
    }
}
