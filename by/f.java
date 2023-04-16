package by.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import org.json.JSONObject;
import ol9.b;

public class f	// class@0002d3
{
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;

    public void f(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = -1;
    }
    public static f a(){
       f obj = PatchProxy.apply(null, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f();
       obj.c = a.b().getPackageName();
       obj.a = "kuaishou";
       obj.b = "øÏ ÷";
       obj.d = a.m;
       return obj;
    }
    public JSONObject b(){
       JSONObject obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       b.e(obj, "appId", this.a);
       b.e(obj, "name", this.b);
       b.e(obj, "packageName", this.c);
       b.e(obj, "version", this.d);
       b.c(obj, "versionCode", this.e);
       return obj;
    }
}
