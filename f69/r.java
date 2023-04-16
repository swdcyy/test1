package f69.r;
import erd.g;
import f69.s;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class r implements g	// class@0022c1
{
    public final s b;

    public void r(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.intValue() != tb.v) {
          tb.S8();
       }
       return;
    }
}
