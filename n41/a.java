package n41.a;
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

public final class a extends AbstractLiveJsCommand	// class@0032a7
{

    public void a(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p1.L();
       return m$a.g(m.g, null, false, 3, null);
    }
}
