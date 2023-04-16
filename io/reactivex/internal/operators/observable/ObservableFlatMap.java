package io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver;

public final class ObservableFlatMap extends a	// class@001894
{
    public final o c;
    public final boolean d;
    public final int e;
    public final int f;

    public void ObservableFlatMap(w p0,o p1,boolean p2,int p3,int p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       if (ObservableScalarXMap.b(this.b, p0, this.c)) {
          return;
       }
       ObservableFlatMap$MergeObserver mergeObserve = new ObservableFlatMap$MergeObserver(p0, this.c, this.d, this.e, this.f);
       this.b.subscribe(v7);
       return;
    }
}
