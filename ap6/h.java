package ap6.h;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class h implements g	// class@00033a
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
