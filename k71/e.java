package k71.e;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.e$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.Boolean;

public final class e extends AbstractLiveJsCommand	// class@002cab
{

    public void e(){
       super();
    }
    public Class a(){
       return e$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!p0 instanceof e$a) {
          return m.g.c("invalid request params");
       }
       p0 = p0.enableDismissTouchOutside;
       boolean b = (p0 != null)? p0.booleanValue(): true;
       p1.l0(b);
       return m$a.g(m.g, null, false, 3, null);
    }
}
