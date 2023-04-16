package m5a.c;
import erd.g;
import m5a.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class c implements g	// class@002f3a
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.J = p0.booleanValue();
       tb.P8();
    }
}
