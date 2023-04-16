package ar3.b$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.apiservices.LiveCommonApi;
import ar3.a;
import com.kuaishou.liveclient.resourcemanager.apiservices.LiveCommonApi$a;
import t45.d;
import brd.z;
import ar3.b$a$a;
import erd.o;

public final class b$a	// class@0002b1
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subBiz");
       t ot = LiveCommonApi.b.a().a(p0).observeOn(d.c).map(b$a$a.b);
       a.o(ot, "LiveCommonApi.service\n  бн      it.body\(\)\n        }");
       return ot;
    }
}
