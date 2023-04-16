package k71.k;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.k$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.core.show.webview.cache.LiveWebViewLocalCacheEntry;
import k71.k$b;
import z1.k;
import tm2.c;

public final class k extends AbstractLiveJsCommand	// class@002cba
{

    public void k(){
       super();
    }
    public Class a(){
       return k$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, k.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof k$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("param is required");
       }
       c.b(p0.a(), new k$b(this));
       return m$a.g(m.g, null, false, 3, null);
    }
}
