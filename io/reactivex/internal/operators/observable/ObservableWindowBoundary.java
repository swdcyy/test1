package io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver;
import crd.b;

public final class ObservableWindowBoundary extends a	// class@00138e
{
    public final w c;
    public final int d;

    public void ObservableWindowBoundary(w p0,w p1,int p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       ObservableWindowBoundary$WindowBoundaryMainObserver windowBounda = new ObservableWindowBoundary$WindowBoundaryMainObserver(p0, this.d);
       p0.onSubscribe(windowBounda);
       this.c.subscribe(windowBounda.boundaryObserver);
       this.b.subscribe(windowBounda);
    }
}
