package k71.u;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import k71.u$a;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.perf.phonelevel.d;
import o63.m$a;

public final class u extends AbstractLiveJsCommand	// class@002cca
{

    public void u(){
       super();
    }
    public Class a(){
       return Object.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, u.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p2 = b.a(-404437045);
       a.o(p2, "Singleton.get\(PhoneLevelUtils::class.java\)");
       return m$a.g(m.g, new u$a(p2.g()), false, 2, null);
    }
}
