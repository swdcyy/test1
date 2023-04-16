package oq1.c;
import oq1.b;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class c	// class@003555
{

    public static final String a(b p0,Map p1){
       i3 obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "multiLineLogParamsProvider");
       obj = i3.f();
       obj.d("biz_session_id", p0.c());
       obj.d("biz_type", p0.f());
       obj.d("chat_id", p0.d());
       obj.d("chat_mode", p0.e());
       obj.d("mode_session_id", p0.a());
       obj.d("session_id", p0.getSessionId());
       a.o(obj, "multiLineLogParamsProvid¡­on_id\", it.sessionId\)\n  }");
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             a.m(key);
             obj.d(key, uEntry.getValue());
          }
       }
       String str = obj.e();
       a.o(str, "jsonBuilder.build\(\)");
       return str;
    }
    public static String b(b p0,Map p1,int p2,Object p3){
       return c.a(p0, null);
    }
}
