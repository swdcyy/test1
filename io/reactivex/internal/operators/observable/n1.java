package io.reactivex.internal.operators.observable.n1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import grd.g;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.n1$b;
import io.reactivex.internal.operators.observable.n1$a;

public final class n1 extends a	// class@0013e5
{
    public final w c;

    public void n1(w p0,w p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       g og = new g(p0);
       ArrayCompositeDisposable uArrayCompos = new ArrayCompositeDisposable(2);
       og.onSubscribe(uArrayCompos);
       n1$b uob = new n1$b(og, uArrayCompos);
       this.c.subscribe(new n1$a(this, uArrayCompos, uob, og));
       this.b.subscribe(uob);
    }
}
