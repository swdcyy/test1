package k71.d;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.d$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.follow.cache.c;
import java.lang.Boolean;
import dsd.a;
import java.util.Map;

public final class d extends AbstractLiveJsCommand	// class@002ca9
{

    public void d(){
       super();
    }
    public Class a(){
       return d$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof d$a) {
          return m.g.c("invalid parameters");
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       p0 = p0.userIdList.iterator();
       while (p0.hasNext()) {
          String str = p0.next();
          linkedHashMa.put(str, a.a(c.b().c(str)));
       }
       return m$a.g(m.g, linkedHashMa, false, 2, null);
    }
}
