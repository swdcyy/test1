package io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import java.lang.Math;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import grd.g;
import io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver;
import io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver;

public final class ObservableConcatMap extends a	// class@00188a
{
    public final o c;
    public final int d;
    public final ErrorMode e;

    public void ObservableConcatMap(w p0,o p1,int p2,ErrorMode p3){
       super(p0);
       this.c = p1;
       this.e = p3;
       this.d = Math.max(8, p2);
    }
    public void subscribeActual(y p0){
       if (ObservableScalarXMap.b(this.b, p0, this.c)) {
          return;
       }
       if (this.e == ErrorMode.IMMEDIATE) {
          this.b.subscribe(new ObservableConcatMap$SourceObserver(new g(p0), this.c, this.d));
       }else {
          a tb = this.b;
          ObservableConcatMap tc = this.c;
          ObservableConcatMap td = this.d;
          boolean b = (this.e == ErrorMode.END)? true: false;
          tb.subscribe(new ObservableConcatMap$ConcatMapDelayErrorObserver(p0, tc, td, b));
       }
       return;
    }
}
