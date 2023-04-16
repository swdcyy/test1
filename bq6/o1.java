package bq6.o1;
import erd.o;
import bq6.p2;
import l85.c;
import oh0.a$c;
import java.lang.Object;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import com.kwai.imsdk.internal.util.b;
import oh0.a$e;
import brd.t;

public final class o1 implements o	// class@0005a7
{
    public final p2 b;
    public final c c;
    public final a$c d;

    public void o1(p2 p0,c p1,a$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       o1 tb = this.b;
       o1 td = this.d;
       Objects.requireNonNull(tb);
       b.a(this.c.d("added: "+td.c.length));
       p0 = (!b.e(td.c))? tb.e(td.c): t.just(new EmptyResponse());
       return p0;
    }
}
