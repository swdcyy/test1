package io.reactivex.internal.operators.single.d;
import brd.a0;
import brd.e0;
import erd.g;
import brd.d0;
import io.reactivex.internal.operators.single.d$a;

public final class d extends a0	// class@00148b
{
    public final e0 b;
    public final g onError;

    public void d(e0 p0,g p1){
       super();
       this.b = p0;
       this.onError = p1;
    }
    public void S(d0 p0){
       this.b.b(new d$a(this, p0));
    }
}
