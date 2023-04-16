package io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.Callable;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver;

public final class ObservableWindowBoundarySupplier extends a	// class@001391
{
    public final Callable c;
    public final int d;

    public void ObservableWindowBoundarySupplier(w p0,Callable p1,int p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new ObservableWindowBoundarySupplier$WindowBoundaryMainObserver(p0, this.d, this.c));
    }
}
