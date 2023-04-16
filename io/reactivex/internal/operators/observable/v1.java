package io.reactivex.internal.operators.observable.v1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.Callable;
import io.reactivex.internal.functions.Functions;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import io.reactivex.internal.operators.observable.v1$a;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class v1 extends a	// class@001425
{
    public final Callable c;

    public void v1(w p0,int p1){
       super(p0);
       this.c = Functions.b(p1);
    }
    public void v1(w p0,Callable p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       Object obj = this.c.call();
       a.c(obj, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
       this.b.subscribe(new v1$a(p0, obj));
    }
}
