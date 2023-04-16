package ah3.r;
import erd.g;
import ah3.v;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import ah3.n;
import z1.a;
import oh3.a;
import jh3.a;

public final class r implements g	// class@0000d7
{
    public final v b;
    public final String c;

    public void r(v p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       r tb = this.b;
       tb.T(false);
       tb.Q(new n(tb, p0));
       tb.g.b(tb.h, this.c, false, p0);
       tb.S();
    }
}
