package ap6.n;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class n implements g	// class@000358
{
    public final k b;

    public void n(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
