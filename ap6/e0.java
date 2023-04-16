package ap6.e0;
import erd.g;
import ro6.a;
import java.lang.Object;
import android.util.Pair;
import java.util.List;
import java.lang.String;
import ca7.u;
import java.lang.CharSequence;

public final class e0 implements g	// class@000327
{
    public final a b;

    public void e0(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       if (tb != null && p0 != null) {
          tb.a(p0.second, u.a(p0.first), u.c(p0.first));
       }
       return;
    }
}
