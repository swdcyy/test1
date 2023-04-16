package io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver;

public final class ObservableSwitchMap extends a	// class@00136f
{
    public final o c;
    public final int d;
    public final boolean e;

    public void ObservableSwitchMap(w p0,o p1,int p2,boolean p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       if (ObservableScalarXMap.b(this.b, p0, this.c)) {
          return;
       }
       this.b.subscribe(new ObservableSwitchMap$SwitchMapObserver(p0, this.c, this.d, this.e));
       return;
    }
}
