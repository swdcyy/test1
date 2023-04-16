package gb1.s0;
import erd.g;
import gb1.u0;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import gb1.i0;
import z1.a;
import eb1.e;

public final class s0 implements g	// class@002485
{
    public final u0 b;

    public void s0(u0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       tb.i(new i0(p0));
    }
}
