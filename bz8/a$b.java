package bz8.a$b;
import erd.g;
import bz8.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import bz8.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class a$b implements g	// class@000493
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "4")) {
             a t = p0.t;
             if (t != null) {
                t.post(new b(p0));
             }
          }
       }
       return;
    }
}
