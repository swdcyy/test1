package ap6.d0;
import erd.g;
import qo6.k1;
import java.lang.Object;
import hp6.b;
import lh0.a$r;
import java.lang.Integer;

public final class d0 implements g	// class@000322
{
    public final k1 b;

    public void d0(k1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       d0 tb = this.b;
       if (tb != null) {
          p0 = (p0.b() != null)? p0.b().b: 0;
          tb.b(Integer.valueOf(p0));
       }
       return;
    }
}
