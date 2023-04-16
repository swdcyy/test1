package d4c.o;
import erd.g;
import d4c.v;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class o implements g	// class@0020d8
{
    public final v b;

    public void o(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       int i = (p0.booleanValue())? 0: 8;
       tb.W8(i);
       return;
    }
}
