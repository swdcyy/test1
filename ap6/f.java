package ap6.f;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class f implements g	// class@000330
{
    public final k b;

    public void f(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
