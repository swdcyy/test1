package h71.i;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;
import lp3.c;
import k2b.e0;
import kotlin.jvm.internal.a;
import k2b.u1;
import o63.m;
import o63.m$a;

public final class i extends AbstractLiveJsCommand	// class@002637
{

    public void i(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, i.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.g(i.class).getPage();
       if (p0 == null) {
          return m.g.c("no current full page");
       }
       a.o(p0, "getService\(LiveLogPackag¡­d\(\"no current full page\"\)");
       u1.L0(p0);
       return m$a.g(m.g, null, false, 3, null);
    }
}
