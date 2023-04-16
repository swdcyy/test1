package h71.m;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import tq5.c;
import lp3.c;
import kotlin.jvm.internal.a;
import o63.m;
import o63.m$a;

public final class m extends AbstractLiveJsCommand	// class@00263e
{

    public void m(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, m.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.h().a(c.class);
       a.o(p0, "serviceManager.getServic¡­tLiveService::class.java\)");
       p0.tc();
       return m$a.g(m.g, null, false, 3, null);
    }
}
