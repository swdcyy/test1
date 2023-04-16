package ap6.o1;
import erd.g;
import qo6.k;
import java.lang.Object;
import java.lang.Boolean;

public final class o1 implements g	// class@00035a
{
    public final k b;

    public void o1(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o1 tb = this.b;
       if (tb != null && p0.booleanValue()) {
          tb.onSuccess();
       }
       return;
    }
}
