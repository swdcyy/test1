package h71.k;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;

public final class k extends AbstractLiveJsCommand	// class@002639
{

    public void k(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, k.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p1.n0();
       return m$a.g(m.g, null, false, 3, null);
    }
}
