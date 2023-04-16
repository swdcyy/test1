package k71.q;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import s51.c;
import lp3.c;
import kotlin.jvm.internal.a;
import o63.m;
import o63.m$a;
import android.app.Activity;
import o63.b;
import android.content.Context;

public final class q extends AbstractLiveJsCommand	// class@002cc3
{

    public void q(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, q.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.h().a(c.class);
       a.o(p0, "serviceManager.getServic¡­ManagerProxy::class.java\)");
       String str = "kwailive://liveshop";
       if (!p0.P0(str)) {
          return m.g.c("not supported");
       }
       if (p0.r4(str, b.a(this.h()))) {
          p1.L();
          p0 = m$a.g(m.g, null, false, 3, null);
       }else {
          p0 = m.g.c("startRouter failed");
       }
       return p0;
    }
}
