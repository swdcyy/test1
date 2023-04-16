package hi1.k;
import erd.o;
import hi1.u;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import ai1.b;
import ok.x;
import brd.t;
import cjd.e;
import java.util.concurrent.TimeUnit;
import hi1.t;

public final class k implements o	// class@0026dd
{
    public final u b;
    public final String c;
    public final boolean d;

    public void k(u p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       return b.a.get().a(this.c, this.d, p0.toString()).map(new e()).timeout(1500, TimeUnit.MILLISECONDS).flatMap(new t(tb));
    }
}
