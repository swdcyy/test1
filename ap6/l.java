package ap6.l;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class l implements g	// class@00034e
{
    public final k b;

    public void l(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
