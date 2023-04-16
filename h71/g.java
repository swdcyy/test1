package h71.g;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import n91.f;
import lp3.c;
import kotlin.jvm.internal.a;
import o63.m;
import java.lang.Long;
import dsd.a;
import o63.m$a;

public final class g extends AbstractLiveJsCommand	// class@002634
{

    public void g(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.h().a(f.class);
       a.o(p0, "serviceManager.getServic¡­TimeProvider::class.java\)");
       return m$a.g(m.g, a.g(p0.s()), false, 2, null);
    }
}
