package ap6.r;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class r implements g	// class@00036c
{
    public final k b;

    public void r(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
