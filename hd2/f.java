package hd2.f;
import java.lang.Object;
import brd.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.pk.d;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import lnc.i3;
import k2b.u1;

public class f	// class@002d64
{

    public void f(){
       super();
    }
    public static x a(){
       Object obj = PatchProxy.apply(null, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("deleteOldPkDisableOldLogic", false);
    }
    public static void c(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "3")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("logType", p0);
       oi3.d("desc", p1);
       oi3.d("source", p2);
       u1.R("LIVE_OLD_PK_REMOVE_RECORD", oi3.e(), 3);
       return;
    }
}
