package bq6.u0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import java.util.List;
import brd.t;
import bq6.t1;

public final class u0 implements o	// class@0005bf
{
    public final p2 b;

    public void u0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       u0 tb = this.b;
       return tb.j(2, p0).flatMap(new t1(tb, p0));
    }
}
