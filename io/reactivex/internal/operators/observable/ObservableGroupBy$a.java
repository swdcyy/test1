package io.reactivex.internal.operators.observable.ObservableGroupBy$a;
import frd.b;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableGroupBy$State;
import brd.y;

public final class ObservableGroupBy$a extends b	// class@001314
{
    public final ObservableGroupBy$State c;

    public void ObservableGroupBy$a(Object p0,ObservableGroupBy$State p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.c.subscribe(p0);
    }
}
