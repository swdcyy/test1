package b4d.s0;
import erd.g;
import b4d.v0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class s0 implements g	// class@00038e
{
    public final v0 b;

    public void s0(v0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.I = p0.booleanValue();
    }
}
