package h71.h;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import h71.h$a;
import nsd.u;
import o63.m$a;

public final class h extends AbstractLiveJsCommand	// class@002636
{

    public void h(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return m$a.g(m.g, new h$a(false, 1, null), false, 2, null);
    }
}
