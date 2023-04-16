package f43.c$c;
import erd.o;
import f43.c;
import java.lang.Object;
import njd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import org.json.JSONObject;
import g43.b;

public class c$c implements o	// class@00286d
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, c$c.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = null;
          if (p0 != null && p0.a() != null) {
             JSONObject jSONObject = new JSONObject(p0.a());
             p0 = PatchProxy.applyOneRefs(jSONObject, obj, b.class, "1");
             if (p0 != patchProxyRe) {
             }else {
                p0 = new b();
                p0.info = GameLiveAuthInfo.f(jSONObject.optJSONObject("authorization"));
             }
             if (p0 != null) {
                obj = p0.info;
             }
          }
       }
       return obj;
    }
}
