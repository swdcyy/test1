package bx4.e;
import java.lang.Runnable;
import bx4.h;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import org.json.JSONObject;
import bx4.c;
import tx4.w;
import java.lang.Throwable;
import zp8.a;

public final class e implements Runnable	// class@0003e5
{
    public final h b;
    public final String c;

    public void e(h p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("createViewKey", tb.j);
       jSONObject.put("waitV8Time", tb.g);
       jSONObject.put("businessName", tb.b);
       jSONObject.put("sdkVersion", tb.c);
       jSONObject.put("sessionId", tb.f);
       w ow = null;
       c p = tb.a.p;
       if (p != null) {
          ow = p.b;
          jSONObject.put("bundleId", ow);
          jSONObject.put("bundleType", p.g);
          jSONObject.put("bundleSource", p.h);
          jSONObject.put("bundleVersion", p.c);
          jSONObject.put("bundleVersionCode", p.d);
          jSONObject.put("taskId", p.f);
       }
       tb.f(jSONObject, tc);
       tb.i("tk_sdk_launch_time", jSONObject.toString(), ow);
       return;
    }
}
