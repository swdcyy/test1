package b58.p;
import b58.m;
import java.lang.Object;
import b58.p$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.mini.d;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import oi8.l;
import n88.b;

public class p	// class@00030c
{
    public final String a;

    public void p(m p0){
       super();
       this.a = p0.c;
    }
    public static void a(p$b p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, p.class, "3")) {
          return;
       }
       d.c("AppSoBackupDownloader", p0.a+","+p0.b+","+p0.c);
       JSONObject obj1 = PatchProxy.apply(obj, p0, p$b.class, "1");
       if (obj1 != PatchProxyResult.class) {
       }else {
          try{
             obj1 = new JSONObject();
             obj1.put("state", p0.a);
             obj1.put("url", p0.b);
             obj1.put("msg", p0.c);
             obj1.put("timestamp", p0.d);
          }catch(org.json.JSONException e4){
             e4.printStackTrace();
          }
       }
    }
}
