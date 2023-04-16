package bq6.f1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import brd.t;

public final class f1 implements o	// class@000582
{
    public final p2 b;
    public final c c;

    public void f1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f1 tb = this.b;
       f1 tc = this.c;
       Objects.requireNonNull(tb);
       b.a(tc.d("folders: "+p0.toString()));
       tb.l(1, p0);
       b.a(tc.b());
       return t.just(new EmptyResponse());
    }
}
