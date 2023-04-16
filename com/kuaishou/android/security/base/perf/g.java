package com.kuaishou.android.security.base.perf.g;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.base.perf.a$a;
import java.lang.Long;
import java.util.Map;
import com.kuaishou.android.security.base.perf.g$a;
import org.json.JSONObject;
import com.kuaishou.android.security.KSecurity;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.base.perf.e;
import org.json.JSONException;

public class g	// class@000f03
{
    public static g a;
    public static final Map b;

    static {
       g.b = new ConcurrentHashMap();
    }
    public void g(){
       super();
    }
    public static g a(){
       Object obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (g.a == null) {
          g.a = new g();
       }
       return g.a;
    }
    public void a(long p0,a$a p1){
       Map b;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, og, "2")) {
          return;
       }
       if (p1 != a$a.c && (p1 != a$a.q && (p1 != a$a.t && (p1 != a$a.r && (p1 != a$a.s && (p1 == a$a.u || p1 == a$a.v)))))) {
          JSONObject jSONObject = new JSONObject();
          try{
             String str = "function";
             jSONObject.put(str, p1.b());
             jSONObject.put("count", 1);
             jSONObject.put("elapsedTimeInMillis", p0);
             jSONObject.put("avg", p0);
             jSONObject.put("appStartTime", KSecurity.getAppStartTime());
             e.a(e$b.e, b.i().j(), "stopwatch", 0, jSONObject);
          }catch(org.json.JSONException e4){
             e4.printStackTrace();
          }
          return;
       }else {
          b = g.b;
          g$a uoa = b.get(p1);
          if (uoa == null) {
             uoa = new g$a(this, p1);
             b.put(p1, uoa);
          }
          uoa.a(p0);
          return;
       }
    }
}
