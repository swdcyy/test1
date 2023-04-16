package io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import brd.t;
import erd.o;
import brd.y;
import java.lang.Object;
import io.reactivex.internal.operators.mixed.a;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver;

public final class ObservableSwitchMapMaybe extends t	// class@0012da
{
    public final t b;
    public final o c;
    public final boolean d;

    public void ObservableSwitchMapMaybe(t p0,o p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       if (!a.b(this.b, this.c, p0)) {
          this.b.subscribe(new ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver(p0, this.c, this.d));
       }
       return;
    }
}
