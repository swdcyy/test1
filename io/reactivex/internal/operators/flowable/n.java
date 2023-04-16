package io.reactivex.internal.operators.flowable.n;
import brd.a0;
import cxd.b;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.flowable.n$a;
import cxd.c;

public final class n extends a0	// class@00127f
{
    public final b b;
    public final Object c;

    public void n(b p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.subscribe(new n$a(p0, this.c));
    }
}
