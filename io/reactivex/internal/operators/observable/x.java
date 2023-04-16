package io.reactivex.internal.operators.observable.x;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import java.util.concurrent.Callable;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import io.reactivex.internal.operators.observable.x$a;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class x extends a	// class@001434
{
    public final o c;
    public final Callable d;

    public void x(w p0,o p1,Callable p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       Object obj = this.d.call();
       a.c(obj, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
       this.b.subscribe(new x$a(p0, this.c, obj));
    }
}
