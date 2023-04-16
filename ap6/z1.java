package ap6.z1;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class z1 implements g	// class@00038b
{
    public final k b;

    public void z1(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z1 tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
