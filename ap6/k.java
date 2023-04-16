package ap6.k;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class k implements g	// class@000349
{
    public final k b;

    public void k(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
