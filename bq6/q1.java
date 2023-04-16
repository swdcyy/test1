package bq6.q1;
import erd.o;
import bq6.p2;
import l85.c;
import oh0.a$c;
import java.lang.Object;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import rh0.a$b;
import l85.b;
import brd.t;
import cp6.u;
import bq6.y;

public final class q1 implements o	// class@0005b0
{
    public final p2 b;
    public final c c;
    public final a$c d;

    public void q1(p2 p0,c p1,a$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       q1 tb = this.b;
       q1 tc = this.c;
       q1 td = this.d;
       Objects.requireNonNull(tb);
       b.a(tc.d("new offset: "+td.a.a));
       return tb.b.f(td.a.a).onErrorReturn(new y(tc));
    }
}
