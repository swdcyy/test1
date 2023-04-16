package bq6.k1;
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

public final class k1 implements o	// class@000596
{
    public final p2 b;
    public final c c;
    public final int d;

    public void k1(p2 p0,c p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       k1 tb = this.b;
       k1 td = this.d;
       Objects.requireNonNull(tb);
       b.a(this.c.d("changeType: "+td+", references: "+p0));
       tb.m(td, p0);
       return t.just(new EmptyResponse());
    }
}
