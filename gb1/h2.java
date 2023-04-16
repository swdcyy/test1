package gb1.h2;
import erd.g;
import gb1.i2;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import gb1.z1;
import z1.a;
import eb1.e;

public final class h2 implements g	// class@002464
{
    public final i2 b;

    public void h2(i2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h2 tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       tb.i(new z1(p0));
    }
}
