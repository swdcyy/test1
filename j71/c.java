package j71.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import j71.c$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;

public abstract class c extends AbstractLiveJsCommand	// class@002a56
{

    public void c(){
       super();
    }
    public Class a(){
       return c$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof c$a) {
          p0 = m.g.c("invalid params");
       }else {
          this.m(p0);
          p0 = m$a.g(m.g, null, false, 3, null);
       }
       return p0;
    }
    public abstract void m(c$a p0);
}
