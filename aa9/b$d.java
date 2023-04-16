package aa9.b$d;
import com.kwai.framework.player.core.b$b;
import aa9.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import aa9.f;

public final class b$d implements b$b	// class@00006e
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
}
