package ap6.e;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class e implements g	// class@00032b
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
