package io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import java.util.concurrent.Callable;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver;
import crd.b;

public final class ObservableBufferBoundary extends a	// class@0012ec
{
    public final Callable c;
    public final w d;
    public final o e;

    public void ObservableBufferBoundary(w p0,w p1,o p2,Callable p3){
       super(p0);
       this.d = p1;
       this.e = p2;
       this.c = p3;
    }
    public void subscribeActual(y p0){
       ObservableBufferBoundary$BufferBoundaryObserver uBufferBound = new ObservableBufferBoundary$BufferBoundaryObserver(p0, this.d, this.e, this.c);
       p0.onSubscribe(uBufferBound);
       this.b.subscribe(uBufferBound);
    }
}
