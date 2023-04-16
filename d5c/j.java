package d5c.j;
import erd.g;
import d5c.g0;
import java.lang.Object;
import j5c.b;
import java.util.Objects;
import java.lang.Integer;
import java.util.Set;
import android.util.SparseIntArray;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;

public final class j implements g	// class@0020fc
{
    public final g0 b;

    public void j(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.c == null && p0.d != -1) {
          b a = p0.a;
          if (a != 6) {
             tb.P.add(Integer.valueOf(a));
             tb.O.put(p0.a, p0.d);
             tb.t9(tb.p.mOwnerCount, true);
          label_003b :
             return;
          }
       }
       tb.P.remove(Integer.valueOf(p0.a));
       goto label_003b ;
    }
}
