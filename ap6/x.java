package ap6.x;
import erd.g;
import qo6.k;
import java.lang.Object;
import java.lang.Boolean;

public final class x implements g	// class@000385
{
    public final k b;

    public void x(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       if (tb != null && p0.booleanValue()) {
          tb.onSuccess();
       }
       return;
    }
}
