package io.reactivex.internal.operators.observable.u0;
import io.reactivex.internal.fuseable.m;
import brd.t;
import java.lang.Object;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import crd.b;

public final class u0 extends t implements m	// class@00141d
{
    public final Object b;

    public void u0(Object p0){
       super();
       this.b = p0;
    }
    public Object call(){
       return this.b;
    }
    public void subscribeActual(y p0){
       ObservableScalarXMap$ScalarDisposable scalarDispos = new ObservableScalarXMap$ScalarDisposable(p0, this.b);
       p0.onSubscribe(scalarDispos);
       scalarDispos.run();
    }
}
