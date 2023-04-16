package i8a.d;
import erd.o;
import java.lang.Object;
import i8a.g$b;
import i8a.g;
import ekd.k1;
import brd.t;
import t45.d;
import brd.z;

public final class d implements o	// class@0027c3
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (k1.g())? t.just(p0): t.just(p0).observeOn(d.a);
       return p0;
    }
}
