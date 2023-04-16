package f69.q;
import erd.g;
import f69.s;
import java.lang.Object;
import java.lang.Boolean;
import qa9.q;

public final class q implements g	// class@0022c0
{
    public final s b;

    public void q(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       p0 = tb.p;
       if (p0 != null && !p0.d()) {
          tb.y = true;
          tb.V8();
       }
       p0 = tb.p;
       if (p0 != null && p0.d()) {
          tb.y = false;
       }
       return;
    }
}
