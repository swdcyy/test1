package ap6.d;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class d implements g	// class@000326
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
