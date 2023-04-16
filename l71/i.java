package l71.i;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.i$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import gq1.l;
import lp3.c;
import hq1.b;

public final class i extends AbstractLiveJsCommand	// class@002e9b
{

    public void i(){
       super();
    }
    public Class a(){
       return i$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, i.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof i$a) {
          return m.g.c("invalid params");
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          this.g(l.class).uf().Ej(p0.userId);
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
