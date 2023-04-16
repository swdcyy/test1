package k19.l;
import erd.g;
import k19.k$c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import k19.k;
import k19.b;
import android.view.ViewGroup;

public final class l implements g	// class@002a88
{
    public final k$c b;

    public void l(k$c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = tb.c.A;
          if (p0 != null) {
             p0.d();
          }
          tb.c.w.setVisibility(8);
       }else {
          p0 = tb.c.A;
          if (p0 != null) {
             p0.b();
          }
          tb.c.w.setVisibility(0);
       }
       return;
    }
}
