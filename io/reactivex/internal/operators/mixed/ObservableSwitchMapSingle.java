package io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import brd.t;
import erd.o;
import brd.y;
import java.lang.Object;
import io.reactivex.internal.operators.mixed.a;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver;

public final class ObservableSwitchMapSingle extends t	// class@0012dd
{
    public final t b;
    public final o c;
    public final boolean d;

    public void ObservableSwitchMapSingle(t p0,o p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       if (!a.c(this.b, this.c, p0)) {
          this.b.subscribe(new ObservableSwitchMapSingle$SwitchMapSingleMainObserver(p0, this.c, this.d));
       }
       return;
    }
}
