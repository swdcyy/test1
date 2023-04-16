package gb1.t0;
import erd.g;
import gb1.u0;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import gb1.l0;
import z1.a;
import eb1.e;

public final class t0 implements g	// class@002488
{
    public final u0 b;

    public void t0(u0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t0 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       tb.i(new l0(p0));
    }
}
