package ap6.c;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class c implements g	// class@000321
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
