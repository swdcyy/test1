package bp6.t;
import erd.g;
import com.kwai.imsdk.internal.o;
import l85.c;
import qo6.h1;
import java.lang.Object;
import iq6.f;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;

public final class t implements g	// class@000550
{
    public final o b;
    public final c c;
    public final h1 d;
    public final long[] e;

    public void t(o p0,c p1,h1 p2,long[] p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       b.a(this.c.d("msgSendEvent#dispatch")+" msgSendEvent: "+p0.b+", msg: "+p0.a);
       p0.a(this.d);
       tb.y(p0, this.e[0]);
    }
}
