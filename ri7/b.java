package ri7.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import java.util.Collection;
import java.util.Map;

public final class b	// class@00238e
{
    public final ConcurrentHashMap a;

    public void b(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public final List a(List p0){
       String obj1;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dependencies");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          Plugin plugin = Dva.instance().getPlugin(obj1);
          int i = 0;
          if (plugin != null && plugin.getPluginType() == 1) {
             i = 1;
          }
          if (i) {
             obj.add(obj1);
          }
       }
       ArrayList uArrayList = new ArrayList(obj);
       Iterator iterator1 = obj.iterator();
       while (iterator1.hasNext()) {
          obj1 = this.a.get(iterator1.next());
          if (obj1 != null) {
             uArrayList.remove(obj1);
          }
       }
       return uArrayList;
    }
    public final void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "parent");
       this.a.put(p0, p1);
       return;
    }
}
