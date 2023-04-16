package io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import erd.d;
import brd.d0;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator;
import crd.b;
import brd.t;
import io.reactivex.internal.operators.observable.ObservableSequenceEqual;
import ird.a;

public final class ObservableSequenceEqualSingle extends a0 implements d	// class@001368
{
    public final w b;
    public final w c;
    public final d d;
    public final int e;

    public void ObservableSequenceEqualSingle(w p0,w p1,d p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void S(d0 p0){
       ObservableSequenceEqualSingle$EqualCoordinator uEqualCoordi = new ObservableSequenceEqualSingle$EqualCoordinator(p0, this.e, this.b, this.c, this.d);
       p0.onSubscribe(v6);
       v6.subscribe();
    }
    public t c(){
       return a.h(new ObservableSequenceEqual(this.b, this.c, this.d, this.e));
    }
}
