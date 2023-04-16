package bed.u;
import erd.g;
import bed.y;
import qm6.b$a;
import java.lang.Object;
import java.io.Serializable;
import java.util.Objects;

public final class u implements g	// class@000423
{
    public final y b;
    public final b$a c;

    public void u(y p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       u tb = this.b;
       u tc = this.c;
       Objects.requireNonNull(tb);
       tc.f0(p0);
       tb.l(tc);
    }
}
