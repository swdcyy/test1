package bq6.a1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import jh0.a$i;
import java.util.Objects;
import com.kwai.imsdk.internal.util.b;
import oh0.a$a;
import brd.t;
import bq6.w;
import bq6.e0;

public final class a1 implements o	// class@00056e
{
    public final p2 b;
    public final c c;

    public void a1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       a1 tb = this.b;
       a1 tc = this.c;
       Objects.requireNonNull(tb);
       p0 = (!b.e(p0.a))? tb.f(p0.a).map(new w(p0)).onErrorReturn(new e0(tc, p0)): t.just(p0);
       return p0;
    }
}
