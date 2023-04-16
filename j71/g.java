package j71.g;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import j71.g$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import no1.c;
import lp3.c;

public final class g extends AbstractLiveJsCommand	// class@002a5c
{

    public void g(){
       super();
    }
    public Class a(){
       return g$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof g$a) {
          return m.g.c("invalid params");
       }
       this.g(c.class).yd(p0.liveChatId, p0.reason);
       return m$a.g(m.g, null, false, 3, null);
    }
}
