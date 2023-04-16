package aa9.b$e;
import com.kwai.framework.player.multisource.e;
import aa9.b;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import aa9.f;
import oc6.b;

public final class b$e implements e	// class@00006f
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public final void b(PlaySourceSwitcher$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       Iterator iterator = this.a.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(int p0){
       a.b(this, p0);
    }
    public void d(b p0){
       a.c(this, p0);
    }
}
