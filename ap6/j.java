package ap6.j;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class j implements g	// class@000344
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
