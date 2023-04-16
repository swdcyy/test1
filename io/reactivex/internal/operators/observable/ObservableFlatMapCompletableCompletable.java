package io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.fuseable.d;
import brd.a;
import brd.w;
import erd.o;
import brd.t;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletable;
import ird.a;
import brd.d;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver;
import brd.y;

public final class ObservableFlatMapCompletableCompletable extends a implements d	// class@00130b
{
    public final w b;
    public final o c;
    public final boolean d;

    public void ObservableFlatMapCompletableCompletable(w p0,o p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public t c(){
       return a.h(new ObservableFlatMapCompletable(this.b, this.c, this.d));
    }
    public void v(d p0){
       this.b.subscribe(new ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver(p0, this.c, this.d));
    }
}
