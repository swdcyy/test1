package ap6.d1;
import erd.g;
import qo6.k;
import java.lang.Object;
import java.lang.Boolean;

public final class d1 implements g	// class@000323
{
    public final k b;

    public void d1(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d1 tb = this.b;
       if (tb != null && p0.booleanValue()) {
          tb.onSuccess();
       }
       return;
    }
}
