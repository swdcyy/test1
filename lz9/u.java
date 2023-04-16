package lz9.u;
import erd.g;
import lz9.b0;
import java.lang.Object;
import zca.s;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import ks7.h0;

public final class u implements g	// class@002eeb
{
    public final b0 b;

    public void u(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a;
       tb.Q = p0;
       if (p0 != null) {
          tb.E().g(false);
       }
       return;
    }
}
