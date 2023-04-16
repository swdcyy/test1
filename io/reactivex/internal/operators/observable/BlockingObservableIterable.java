package io.reactivex.internal.operators.observable.BlockingObservableIterable;
import java.lang.Iterable;
import brd.w;
import java.lang.Object;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.BlockingObservableIterable$BlockingObservableIterator;
import brd.y;

public final class BlockingObservableIterable implements Iterable	// class@0012e2
{
    public final w b;
    public final int c;

    public void BlockingObservableIterable(w p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Iterator iterator(){
       BlockingObservableIterable$BlockingObservableIterator uBlockingObs = new BlockingObservableIterable$BlockingObservableIterator(this.c);
       this.b.subscribe(uBlockingObs);
       return uBlockingObs;
    }
}
