package f11.u;
import erd.g;
import f11.w;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class u implements g	// class@002284
{
    public final w b;

    public void u(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       tb.w = p0.booleanValue();
    }
}
