package f21.c;
import java.lang.Runnable;
import f21.b$b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.b$b;
import java.util.Objects;
import f21.b;
import java.util.Iterator;
import java.util.ArrayList;

public final class c implements Runnable	// class@00229e
{
    public final b$b$a b;

    public void c(b$b$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       b$b a = this.b.a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, b.class, "13")) {
          Iterator iterator = a.c.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
          a.c.clear();
       }
       return;
    }
}
