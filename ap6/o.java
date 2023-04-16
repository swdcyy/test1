package ap6.o;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class o implements g	// class@00035d
{
    public final k b;

    public void o(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
