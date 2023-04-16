package bp6.j;
import erd.o;
import com.kwai.imsdk.internal.o;
import l85.c;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import pq6.a;
import iq6.f;

public final class j implements o	// class@00052f
{
    public final o b;
    public final c c;
    public final KwaiMsg[] d;
    public final long[] e;

    public void j(o p0,c p1,KwaiMsg[] p2,long[] p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       b.h(this.c.c()+" msg: "+p0);
       this.d[0] = p0;
       this.e[0] = a.b();
       tb.x(p0);
       return tb.l(p0);
    }
}
