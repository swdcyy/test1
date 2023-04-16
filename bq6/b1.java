package bq6.b1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import jh0.a$i;
import java.util.Objects;
import com.kwai.imsdk.internal.util.b;
import oh0.a$e;
import brd.t;
import bq6.w;
import bq6.g0;

public final class b1 implements o	// class@000572
{
    public final p2 b;
    public final c c;

    public void b1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       b1 tb = this.b;
       b1 tc = this.c;
       Objects.requireNonNull(tb);
       p0 = (!b.e(p0.b))? tb.e(p0.b).map(new w(p0)).onErrorReturn(new g0(tc, p0)): t.just(p0);
       return p0;
    }
}
