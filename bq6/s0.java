package bq6.s0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import java.util.List;
import brd.t;
import bq6.s1;

public final class s0 implements o	// class@0005b7
{
    public final p2 b;

    public void s0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       s0 tb = this.b;
       return tb.j(0, p0).flatMap(new s1(tb, p0));
    }
}
