package n41.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import n41.c$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import lp3.e;
import s51.c;
import lp3.c;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.app.Activity;
import o63.b;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import java.lang.Boolean;
import dsd.a;

public final class c extends AbstractLiveJsCommand	// class@0032aa
{

    public void c(){
       super();
    }
    public Class a(){
       return c$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!p0 instanceof c$a) {
          return m.g.c("invalid request params");
       }
       c$a uoa = p0;
       String str = uoa.a();
       e uoe = (str == null || !str.length())? 1: null;
       if (uoe) {
          return m.g.c("param url is required");
       }else {
          c uoc = this.h().a(c.class);
          a.o(uoc, "serviceManager.getServic¡­ManagerProxy::class.java\)");
          if (!uoc.P0(uoa.a())) {
             return m.g.c("url is not supported: "+p0+".url");
          }else if(!uoc.r4(uoa.a(), b.a(this.h()))){
             p0 = b.a(this.h());
             if (p0 != null) {
                p0 = p0.getBaseContext();
                if (p0 != null) {
                   a.b(b.j(p0, uoa.a()), null);
                }
             }
          }
          if (a.g(uoa.dismiss, a.a(true))) {
             p1.L();
          }
          return m$a.g(m.g, null, false, 3, null);
       }
    }
}
