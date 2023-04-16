package bq6.m1;
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
import oh0.a$a;
import brd.t;

public final class m1 implements o	// class@00059f
{
    public final p2 b;
    public final c c;
    public final a$c d;

    public void m1(p2 p0,c p1,a$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       m1 tb = this.b;
       m1 td = this.d;
       Objects.requireNonNull(tb);
       b.a(this.c.d("folderBasic: "+td.b.length));
       p0 = (!b.e(td.b))? tb.f(td.b): t.just(new EmptyResponse());
       return p0;
    }
}
