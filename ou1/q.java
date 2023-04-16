package ou1.q;
import androidx.lifecycle.Observer;
import ou1.u;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ou1.c;

public final class q implements Observer	// class@0035a6
{
    public final u b;

    public void q(u p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          u s = this.b.s;
          if (s != null) {
             a.o(p0, "it");
             s.b(p0.longValue());
          }
       }
       return;
    }
}
