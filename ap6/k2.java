package ap6.k2;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class k2 implements g	// class@000347
{
    public final k b;

    public void k2(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k2 tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
