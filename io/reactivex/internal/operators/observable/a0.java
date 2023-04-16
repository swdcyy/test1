package io.reactivex.internal.operators.observable.a0;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.g;
import erd.a;
import brd.y;
import io.reactivex.internal.operators.observable.a0$a;

public final class a0 extends a	// class@0018cf
{
    public final a c;
    public final a onComplete;
    public final g onError;
    public final g onNext;

    public void a0(w p0,g p1,g p2,a p3,a p4){
       super(p0);
       this.onNext = p1;
       this.onError = p2;
       this.onComplete = p3;
       this.c = p4;
    }
    public void subscribeActual(y p0){
       a0$a uoa = new a0$a(p0, this.onNext, this.onError, this.onComplete, this.c);
       this.b.subscribe(v7);
    }
}
