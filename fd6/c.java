package fd6.c;
import gd6.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gd6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;

public final class c implements b	// class@0015fc
{
    public final List b;

    public void c(List p0){
       a.p(p0, "mUrlInterceptors");
       super();
       this.b = p0;
    }
    public String a(a p0){
       String str;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pluginUrlInfo");
       obj = this.b.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          str = obj.next().a(p0);
          if (str != null) {
             break ;
          }
       }
       return str;
    }
}
