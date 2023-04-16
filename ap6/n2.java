package ap6.n2;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class n2 implements g	// class@000356
{
    public final k b;

    public void n2(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n2 tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
