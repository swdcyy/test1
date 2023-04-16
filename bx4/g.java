package bx4.g;
import java.lang.Runnable;
import bx4.h;
import java.lang.Object;
import java.util.Objects;
import org.json.JSONObject;
import dx4.a;
import java.lang.String;
import java.util.Map;
import java.util.Collection;
import java.lang.Throwable;
import zp8.a;

public final class g implements Runnable	// class@0003e7
{
    public final h b;
    public final boolean c;

    public void g(h p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("engineCount", a.e().d());
       jSONObject.put("contextCount", a.e().b());
       jSONObject.put("contextDetail", a.e().c().values());
       jSONObject.put("appSessionId", tb.e);
       jSONObject.put("sdkVersion", tb.c);
       String str = "isCreate";
       int i = (this.c != null)? 1: 0;
       jSONObject.put(str, i);
       tb.i("tk_multi_instance_statistics", jSONObject.toString(), null);
       return;
    }
}
