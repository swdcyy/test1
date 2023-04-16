package hf9.f$c;
import androidx.lifecycle.Observer;
import hf9.f;
import java.lang.Object;
import kf9.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf9.q;
import kf9.g;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import kf9.b;

public final class f$c implements Observer	// class@002643
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, str)) {
       }else {
          g og = f.g2(this.b).u0();
          a.o(p0, "state");
          Objects.requireNonNull(og);
          if (!PatchProxy.applyVoidOneRefs(p0, og, g.class, str)) {
             a.p(p0, "newState");
             Iterator iterator = og.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0);
             }
          }
       }
       return;
    }
}
