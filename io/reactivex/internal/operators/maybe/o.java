package io.reactivex.internal.operators.maybe.o;
import io.reactivex.internal.fuseable.f;
import brd.a0;
import brd.q;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.maybe.o$a;
import brd.p;

public final class o extends a0 implements f	// class@0012c6
{
    public final q b;
    public final Object c;

    public void o(q p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.b(new o$a(p0, this.c));
    }
    public q a(){
       return this.b;
    }
}
