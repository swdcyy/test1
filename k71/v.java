package k71.v;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import h02.b;
import lp3.e;
import o63.m;
import o63.m$a;

public final class v extends AbstractLiveJsCommand	// class@002ccb
{

    public void v(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, v.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       d.a(-204054297).Fr(this.h());
       return m$a.g(m.g, null, false, 3, null);
    }
}
