package io.reactivex.internal.operators.observable.ObservableUsing;
import brd.t;
import java.util.concurrent.Callable;
import erd.o;
import erd.g;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.ObservableUsing$UsingObserver;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.exceptions.CompositeException;

public final class ObservableUsing extends t	// class@001388
{
    public final Callable b;
    public final o c;
    public final g d;
    public final boolean e;

    public void ObservableUsing(Callable p0,o p1,g p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       Object obj = this.b.call();
       Object obj1 = this.c.apply(obj);
       a.c(obj1, "The sourceSupplier returned a null ObservableSource");
       obj1.subscribe(new ObservableUsing$UsingObserver(p0, obj, this.d, this.e));
    }
}
