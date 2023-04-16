package nx1.f;
import cxd.b;
import nx1.j;
import sx4.e$a;
import java.lang.Object;
import cxd.c;
import java.util.Objects;
import nx1.e;
import brd.t;
import nx1.d;
import erd.g;
import crd.b;

public final class f implements b	// class@00340f
{
    public final j b;
    public final e$a c;

    public void f(j p0,e$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(c p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       tb.g = t.fromPublisher(new e(tb)).subscribe(new d(tb, this.c, p0));
    }
}
