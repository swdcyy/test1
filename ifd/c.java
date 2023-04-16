package ifd.c;
import erd.g;
import ifd.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import v99.a;

public final class c implements g	// class@001002
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.p.j("stop_unknown");
       }
       return;
    }
}
