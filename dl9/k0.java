package dl9.k0;
import erd.g;
import dl9.m0;
import java.lang.Object;
import java.lang.Integer;
import dl9.m0$c;
import hc.a;

public final class k0 implements g	// class@001f72
{
    public final m0 b;

    public void k0(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       if (tb.z.b == null) {
       }else if(p0.intValue() == 1){
          tb.z.b.stop();
       }else {
          tb.z.b.start();
       }
       return;
    }
}
