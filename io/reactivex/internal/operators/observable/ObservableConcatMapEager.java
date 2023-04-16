package io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager$ConcatMapEagerMainObserver;

public final class ObservableConcatMapEager extends a	// class@0012f7
{
    public final o c;
    public final ErrorMode d;
    public final int e;
    public final int f;

    public void ObservableConcatMapEager(w p0,o p1,ErrorMode p2,int p3,int p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       ObservableConcatMapEager$ConcatMapEagerMainObserver uConcatMapEa = new ObservableConcatMapEager$ConcatMapEagerMainObserver(p0, this.c, this.e, this.f, this.d);
       this.b.subscribe(v7);
    }
}
