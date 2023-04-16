package ch3.p;
import erd.g;
import ch3.t;
import java.lang.Object;
import java.lang.Throwable;
import ch3.l;
import z1.a;
import oh3.a;
import jh3.a;
import java.lang.String;
import oh3.f;

public final class p implements g	// class@000559
{
    public final t b;
    public final int c;

    public void p(t p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p tb = this.b;
       p tc = this.c;
       tb.V(false);
       tb.Q(new l(tb, tc, p0));
       tb.g.j(tc, false, p0);
       tb.d.d("startMatch", p0);
       tb.S();
    }
}
