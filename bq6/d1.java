package bq6.d1;
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
import bq6.o;
import erd.g;
import bq6.b2;

public final class d1 implements o	// class@00057a
{
    public final p2 b;
    public final c c;

    public void d1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       d1 tb = this.b;
       d1 tc = this.c;
       Objects.requireNonNull(tb);
       b.a(tc.d("models: "+p0.toString()));
       return tb.c.f(p0).doOnError(new o(tc)).map(new b2(p0));
    }
}
