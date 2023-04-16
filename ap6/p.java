package ap6.p;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class p implements g	// class@000362
{
    public final k b;

    public void p(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
