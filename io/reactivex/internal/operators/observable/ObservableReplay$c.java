package io.reactivex.internal.operators.observable.ObservableReplay$c;
import brd.t;
import java.util.concurrent.Callable;
import erd.o;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import frd.a;
import brd.w;
import io.reactivex.internal.operators.observable.ObserverResourceWrapper;
import io.reactivex.internal.operators.observable.ObservableReplay$b;
import erd.g;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableReplay$c extends t	// class@001348
{
    public final Callable b;
    public final o c;

    public void ObservableReplay$c(Callable p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void subscribeActual(y p0){
       Object obj = this.b.call();
       a.c(obj, "The connectableFactory returned a null ConnectableObservable");
       Object obj1 = this.c.apply(obj);
       a.c(obj1, "The selector returned a null ObservableSource");
       ObserverResourceWrapper observerReso = new ObserverResourceWrapper(p0);
       obj1.subscribe(observerReso);
       obj.c(new ObservableReplay$b(observerReso));
    }
}
