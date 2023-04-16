package gb1.g2;
import erd.g;
import gb1.i2;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import gb1.w1;
import z1.a;
import eb1.e;

public final class g2 implements g	// class@002460
{
    public final i2 b;

    public void g2(i2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g2 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       tb.i(new w1(p0));
    }
}
