package b93.e;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Map;
import b93.e$a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public abstract class e	// class@000377
{
    public final Map a;

    public void e(){
       super();
       this.a = new LinkedHashMap();
       this.b();
    }
    public final boolean a(Class p0,Class p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "clazz");
       a.p(p1, "serviceClass");
       e$a uoa = this.a.get(p0);
       if (uoa != null) {
          uoa = uoa.d;
          if (uoa != null) {
             b = uoa.contains(p1);
          label_0031 :
             return b;
          }
       }
       b = true;
       goto label_0031 ;
    }
    public abstract void b();
    public final void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "registry2");
       Iterator iterator = p0.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Class key = uEntry.getKey();
          this.a.put(key, uEntry.getValue());
       }
       return;
    }
}
