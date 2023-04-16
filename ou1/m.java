package ou1.m;
import androidx.lifecycle.Observer;
import ou1.o;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ou1.c;

public final class m implements Observer	// class@0035a2
{
    public final o b;

    public void m(o p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          o u = this.b.u;
          if (u != null) {
             a.o(p0, "it");
             u.b(p0.longValue());
          }
       }
       return;
    }
}
