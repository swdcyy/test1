package io.reactivex.internal.operators.single.f;
import brd.a0;
import brd.e0;
import erd.g;
import brd.d0;
import io.reactivex.internal.operators.single.f$a;

public final class f extends a0	// class@00148f
{
    public final e0 b;
    public final g onSubscribe;

    public void f(e0 p0,g p1){
       super();
       this.b = p0;
       this.onSubscribe = p1;
    }
    public void S(d0 p0){
       this.b.b(new f$a(p0, this.onSubscribe));
    }
}
