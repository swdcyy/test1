package io.reactivex.internal.operators.completable.i;
import brd.a;
import brd.e;
import erd.g;
import erd.a;
import brd.d;
import io.reactivex.internal.operators.completable.i$a;

public final class i extends a	// class@00120b
{
    public final e b;
    public final a c;
    public final a d;
    public final a e;
    public final a onComplete;
    public final g onError;
    public final g onSubscribe;

    public void i(e p0,g p1,g p2,a p3,a p4,a p5,a p6){
       super();
       this.b = p0;
       this.onSubscribe = p1;
       this.onError = p2;
       this.onComplete = p3;
       this.c = p4;
       this.d = p5;
       this.e = p6;
    }
    public void v(d p0){
       this.b.a(new i$a(this, p0));
    }
}
