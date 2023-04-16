package bq6.v1;
import erd.o;
import bq6.p2;
import java.util.List;
import l85.c;
import java.lang.Object;
import brd.t;
import cp6.w;
import bq6.c2;
import bq6.d2;
import brd.a0;
import bq6.k1;

public final class v1 implements o	// class@0005c4
{
    public final p2 b;
    public final List c;
    public final c d;
    public final int e;

    public void v1(p2 p0,List p1,c p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       v1 tb = this.b;
       v1 tc = this.c;
       return tb.c.f(p0).flatMap(new c2(p0)).flatMap(new d2(tc)).toList().w(new k1(tb, this.d, this.e));
    }
}
