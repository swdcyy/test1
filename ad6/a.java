package ad6.a;
import ad6.a$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.repository.model.PluginConfig;

public final class a	// class@000075
{
    public static final a$a a;

    static {
       a.a = new a$a(null);
    }
    public void a(){
       super();
    }
    public final boolean a(List p0,List p1){
       Object obj1;
       PluginConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "updateConfigs");
       a.p(p1, "currentConfigs");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          obj = iterator.next();
          Iterator iterator1 = p1.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                obj1 = iterator1.next();
                if (!a.g(obj1.name, obj.name)) {
                   continue ;
                }
             }else {
                obj1 = null;
             }
             if (obj1 != null && obj1.version > obj.version) {
                break ;
             }else {
                continue ;
             }
          }
          return false;
       }
    }
}
