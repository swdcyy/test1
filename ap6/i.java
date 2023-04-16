package ap6.i;
import erd.g;
import qo6.k;
import java.lang.Object;
import hp6.b;

public final class i implements g	// class@00033f
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       if (tb != null) {
          tb.onSuccess();
       }
       return;
    }
}
