package ena.j$a;
import java.lang.Object;
import nsd.u;
import android.view.View;
import ena.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.ref.WeakReference;

public final class j$a	// class@002780
{

    public void j$a(){
       super();
    }
    public void j$a(u p0){
       super();
    }
    public final j a(View p0){
       j oj;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "rootView");
       obj = j.x.entrySet().iterator();
       while (true) {
          if (obj.hasNext()) {
             Map$Entry uEntry = obj.next();
             WeakReference key = uEntry.getKey();
             WeakReference value = uEntry.getValue();
             if (a.g(key.get(), p0)) {
                oj = value.get();
                if (oj != null) {
                   break ;
                }
             }
          }else {
             j oj1 = new j(p0);
             j.x.put(new WeakReference(p0), new WeakReference(oj1));
             return oj1;
          }
       }
       a.o(oj, "it");
       return oj;
    }
}
