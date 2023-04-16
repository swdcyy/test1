package bq6.n0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import java.util.List;
import brd.t;
import cp6.w;
import bq6.b2;

public final class n0 implements o	// class@0005a2
{
    public final p2 b;

    public void n0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return this.b.c.f(p0).map(new b2(p0));
    }
}
