package ap6.s0;
import erd.g;
import qo6.k;
import java.lang.Object;
import java.lang.Boolean;

public final class s0 implements g	// class@00036d
{
    public final k b;

    public void s0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s0 tb = this.b;
       if (tb != null && p0.booleanValue()) {
          tb.onSuccess();
       }
       return;
    }
}
