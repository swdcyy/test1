package io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;

public final class ObservableGroupBy extends a	// class@001315
{
    public final o c;
    public final o d;
    public final int e;
    public final boolean f;

    public void ObservableGroupBy(w p0,o p1,o p2,int p3,boolean p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       ObservableGroupBy$GroupByObserver groupByObser = new ObservableGroupBy$GroupByObserver(p0, this.c, this.d, this.e, this.f);
       this.b.subscribe(v7);
    }
}
