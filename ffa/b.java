package ffa.b;
import ffa.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import android.app.Application;
import o56.a;
import android.content.Context;
import dd5.t;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import k2b.u1;

public final class b	// class@0028dd
{
    public final Map a;
    public final String b;
    public final String c;
    public final String d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
    }
    public void b(String p0,String p1,String p2){
       a.p(p0, "sessionId");
       a.p(p1, "stageName");
       a.p(p2, "cacheKey");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = new LinkedHashMap();
    }
    public final b a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       this.a.put(p0, p1);
       return this;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       if (t.a(uApplication, "organizer-cache", "organizerCacheLogEnable")) {
          i3 oi3 = i3.f();
          oi3.d("session_id", this.b);
          oi3.d("stage_name", this.c);
          oi3.d("cache_key", this.d);
          Iterator iterator = this.a.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             oi3.d(str, this.a.get(str));
          }
          u1.R("organizer_log_key", oi3.e(), 13);
       }
       return;
    }
}
