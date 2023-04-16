package by.c;
import java.lang.Object;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.String;
import com.yxcorp.utility.SystemUtil;
import h30.a;
import android.os.Build$VERSION;
import java.util.Locale;
import com.yxcorp.utility.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import ol9.b;

public class c	// class@0002d0
{
    public String a;
    public String b;
    public final int c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;
    public static c i;
    public static Object j;

    static {
       c.j = new Object();
    }
    public void c(){
       super();
       this.c = 1;
       this.a = SystemUtil.m(a.b());
       this.b = a.d();
       this.d = Build$VERSION.RELEASE;
       this.e = Locale.getDefault().getLanguage();
       this.g = n.u(a.b());
       this.f = n.y(a.b());
       this.h = a.a;
    }
    public static c a(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.i == null) {
          obj = c.j;
          _monitor_enter(obj);
          if (c.i == null) {
             c.i = new c();
          }
          _monitor_exit(obj);
       }
       return c.i;
    }
    public JSONObject b(){
       JSONObject obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       if (!TextUtils.isEmpty(this.a)) {
          b.e(obj, "imei", this.a);
       }
       b.e(obj, "oaid", this.b);
       b.c(obj, "osType", 1);
       b.e(obj, "osVersion", this.d);
       b.e(obj, "language", this.e);
       b.e(obj, "deviceId", this.h);
       JSONObject jSONObject = new JSONObject();
       b.c(jSONObject, "width", this.f);
       b.c(jSONObject, "height", this.g);
       b.g(obj, "screenSize", jSONObject);
       return obj;
    }
    public c c(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i.a = SystemUtil.m(a.b());
       if (TextUtils.isEmpty(this.b)) {
          c.i.b = a.d();
       }
       return c.i;
    }
}
