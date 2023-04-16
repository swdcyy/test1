package h19.b;
import erd.g;
import h19.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class b implements g	// class@002534
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       tb.I = p0.booleanValue();
    }
}
