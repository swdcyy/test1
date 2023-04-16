package h71.b;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.b$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import ps1.a;
import lp3.c;
import ps1.b;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;

public final class b extends AbstractLiveJsCommand	// class@00262d
{

    public void b(){
       super();
    }
    public Class a(){
       return b$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof b$a) {
          return m.g.c("invalid params");
       }
       b uob = this.g(a.class).e8();
       if (uob != null) {
          p0 = p0.endMode;
          a.m(p0);
          uob.a(p0.detest, p0.endPkReasonTypes, p0.intValue());
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
