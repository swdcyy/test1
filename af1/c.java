package af1.c;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import bf1.j;

public class c	// class@00006d
{
    public final Map a;
    public final Map b;

    public void c(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public final void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       Iterator iterator = p0.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy();
       }
       p0.clear();
       return;
    }
}
