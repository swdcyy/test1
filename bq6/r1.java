package bq6.r1;
import erd.o;
import bq6.p2;
import l85.c;
import oh0.a$c;
import java.lang.Object;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import rh0.a$b;
import brd.t;

public final class r1 implements o	// class@0005b4
{
    public final p2 b;
    public final c c;
    public final a$c d;

    public void r1(p2 p0,c p1,a$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       r1 tc = this.c;
       r1 td = this.d;
       this.b.e = false;
       b.a(tc.d("notFullFetch: "+td.e));
       b.a(tc.d("offset: "+td.a.a));
       return t.just(td);
    }
}
