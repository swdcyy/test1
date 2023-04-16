package h73.f;
import erd.g;
import h73.t;
import z1.a;
import java.lang.Object;
import com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupJoinResponse;
import java.util.Objects;
import h73.q;
import lnc.c3$a;
import lnc.c3;
import h73.c;

public final class f implements g	// class@002cb3
{
    public final t b;
    public final a c;
    public final a d;

    public void f(t p0,a p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       c3.c(this.c, new q(p0));
       c3.c(this.d, c.a);
       tb.b();
    }
}
