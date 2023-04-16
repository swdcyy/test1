package f99.a;
import erd.g;
import f99.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class a implements g	// class@0022e0
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       tb.R = p0.booleanValue();
    }
}
