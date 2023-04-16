package by.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import org.json.JSONObject;
import ol9.b;
import org.json.JSONArray;

public class b	// class@0002cf
{
    public String a;
    public int b;
    public String c;
    public JSONArray d;

    public void b(){
       super();
       this.a = "";
       this.c = "";
    }
    public static b a(){
       b obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       if (QCurrentUser.ME != null && QCurrentUser.ME.isLogined()) {
          obj.a = QCurrentUser.ME.getId();
       }
       return obj;
    }
    public JSONObject b(){
       JSONObject obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       b.e(obj, "userId", this.a);
       b.c(obj, "age", this.b);
       b.e(obj, "gender", this.c);
       b.f(obj, "interest", this.d);
       return obj;
    }
}
