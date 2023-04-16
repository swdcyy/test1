package bx4.f;
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

public final class f implements Runnable	// class@0003e6
{
    public final h b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;

    public void f(h p0,String p1,long p2,long p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("createViewKey", tb.e(tc));
       jSONObject.put("businessName", tb.b);
       jSONObject.put("container_sessionId", tb.f);
       jSONObject.put("view_sessionId", tc);
       jSONObject.put("beginSetDataTime", this.d);
       jSONObject.put("endSetDataTime", this.e);
       jSONObject.put("setDataCount", this.f);
       w ow = null;
       c p = tb.a.p;
       if (p != null) {
          ow = p.b;
          jSONObject.put("bundleId", ow);
       }
       tb.i("tk_set_data", jSONObject.toString(), ow);
       return;
    }
}
