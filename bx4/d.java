package bx4.d;
import java.lang.Runnable;
import bx4.h;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import org.json.JSONObject;
import bx4.c;
import tx4.w;
import dx4.a;
import java.util.Map;
import java.util.Collection;
import java.lang.Throwable;
import zp8.a;

public final class d implements Runnable	// class@0003e4
{
    public final h b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public void d(h p0,int p1,int p2,String p3,String p4,String p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       d tf = this.f;
       d tg = this.g;
       Objects.requireNonNull(tb);
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("result", tc);
       if (tc != 1) {
          jSONObject.put("errorCode", td);
          jSONObject.put("error", te);
       }
       jSONObject.put("bundleId", tf);
       c p = tb.a.p;
       if (p != null) {
          jSONObject.put("bundleType", p.g);
          jSONObject.put("bundleSource", p.h);
          jSONObject.put("bundleVersionCode", p.d);
          jSONObject.put("taskId", p.f);
       }
       jSONObject.put("createViewKey", tb.e(tg));
       jSONObject.put("businessName", tb.b);
       jSONObject.put("waitV8Time", tb.g);
       jSONObject.put("sdkVersion", tb.c);
       jSONObject.put("container_sessionId", tb.f);
       jSONObject.put("view_sessionId", tg);
       jSONObject.put("engineCount", a.e().d());
       jSONObject.put("contextCount", a.e().b());
       jSONObject.put("contextDetail", a.e().c().values());
       jSONObject.put("appSessionId", tb.e);
       tb.f(jSONObject, tg);
       tb.i("tk_load_result", jSONObject.toString(), tf);
       return;
    }
}
