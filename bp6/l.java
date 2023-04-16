package bp6.l;
import erd.o;
import com.kwai.imsdk.internal.o;
import l85.c;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;
import java.util.Objects;
import pq6.a;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import iq6.f;

public final class l implements o	// class@000537
{
    public final o b;
    public final long[] c;
    public final c d;

    public void l(o p0,long[] p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       this.c[0] = a.b();
       b.h(this.d.c()+" msg: "+p0);
       tb.x(p0);
       return tb.l(p0);
    }
}
