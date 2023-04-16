package e8a.g$b;
import java.lang.Runnable;
import e8a.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import jta.e;
import kotlin.jvm.internal.a;
import android.view.View;

public final class g$b implements Runnable	// class@0020a7
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.P8().iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          g r = this.b.r;
          if (r != null) {
             a.m(r);
             g r1 = this.b.r;
             a.m(r1);
             uoe.b(r.getWidth(), r1.getHeight());
          }
       }
       return;
    }
}
