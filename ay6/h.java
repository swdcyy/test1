package ay6.h;
import java.lang.Runnable;
import ay6.h$a;
import nsd.u;
import z1.g;
import ay6.g;
import qrd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import java.lang.Math;
import ay6.k;
import ay6.a;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.StringBuilder;

public final class h implements Runnable	// class@0003a6
{
    public g b;
    public p c;
    public static final g d;
    public static final h$a e;

    static {
       h.e = new h$a(null);
       h.d = new g(8);
    }
    public void h(g p0,p p1){
       a.p(p0, "reportObj");
       a.p(p1, "configProvider");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       JSONObject value = this.c.getValue();
       if (value != null) {
          double d = 0xbff0000000000000;
          double d1 = value.optDouble(this.b.a(), d);
          int i = 0;
          double d2 = (double)i;
          if (d1 - d2 < 0) {
             d1 = value.optDouble("ratio", d);
          }
          if (d1 - d2 > 0 && Math.random() - d1 < 0) {
             i = 1;
          }
          if (i) {
             h tb = this.b;
             Objects.requireNonNull(tb);
             JSONObject jSONObject = new JSONObject();
             jSONObject.putOpt("isMainThread", Boolean.valueOf(tb.a)).putOpt("className", tb.b).putOpt("traceTag", tb.c).putOpt("timeCostMs", Long.valueOf(tb.d)).putOpt("uuid", tb.e).putOpt("kitViewId", tb.f).putOpt("isAnr", Boolean.valueOf(tb.h));
             String str = jSONObject.toString();
             a.o(str, "json.toString\(\)");
             a.a().b("GothamTrace", str);
             a.a().i("GothamTraceReportRunnab", "report api cost: "+this.b.a());
          }
       }
       h.d.a(this);
       return;
    }
}
