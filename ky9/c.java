package ky9.c;
import erd.g;
import ky9.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class c implements g	// class@002d23
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.C = p0.booleanValue();
       tb.n0();
    }
}
