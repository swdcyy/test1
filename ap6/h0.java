package ap6.h0;
import erd.g;
import qo6.k;
import java.lang.Object;
import java.lang.Boolean;

public final class h0 implements g	// class@000336
{
    public final k b;

    public void h0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h0 tb = this.b;
       if (tb != null && p0.booleanValue()) {
          tb.onSuccess();
       }
       return;
    }
}
