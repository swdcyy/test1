package h63.u;
import erd.g;
import h63.y;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class u implements g	// class@002ca0
{
    public final y b;

    public void u(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          tb.w = true;
          tb.W8();
       }
       return;
    }
}
