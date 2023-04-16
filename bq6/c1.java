package bq6.c1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import brd.t;
import cp6.w;
import bq6.n;
import erd.g;
import bq6.b2;

public final class c1 implements o	// class@000576
{
    public final p2 b;
    public final c c;

    public void c1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       c1 tb = this.b;
       c1 tc = this.c;
       Objects.requireNonNull(tb);
       b.a(tc.d("models: "+p0.toString()));
       return tb.c.f(p0).doOnError(new n(tc)).map(new b2(p0));
    }
}
