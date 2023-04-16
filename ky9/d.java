package ky9.d;
import erd.g;
import ky9.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class d implements g	// class@002d24
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.D = p0.booleanValue() ^ 0x01;
       tb.n0();
    }
}
