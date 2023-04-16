package bq6.g1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import jh0.a$i;
import java.util.Objects;
import oh0.a$e;
import brd.t;
import bq6.w;
import bq6.f0;

public final class g1 implements o	// class@000586
{
    public final p2 b;
    public final c c;

    public void g1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       g1 tb = this.b;
       g1 tc = this.c;
       Objects.requireNonNull(tb);
       a$i c = p0.c;
       p0 = (c.length > 0)? tb.g(c).map(new w(p0)).onErrorReturn(new f0(tc, p0)): t.just(p0);
       return p0;
    }
}
