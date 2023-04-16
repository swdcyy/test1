package bb2.d;
import erd.g;
import bb2.g;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class d implements g	// class@0003c5
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.P8();
       }
       return;
    }
}
