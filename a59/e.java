package a59.e;
import a59.c;
import a59.e$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.StringBuilder;
import a59.f;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import java.lang.Integer;

public abstract class e implements c	// class@000044
{
    public static final e$a a;

    static {
       e.a = new e$a(null);
    }
    public void e(){
       super();
    }
    public Object b(String p0,JSONObject p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bridgeName");
       a.p(p1, "data");
       if (a.g(p0, this.a())) {
          return this.c(p1, p2);
       }
       return "flag_bridge_not_match";
    }
    public final HashMap d(HashMap p0,JSONObject p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$appendJSONObject");
       if (p1 != null) {
          obj = p1.keys();
          if (obj != null) {
             while (obj.hasNext()) {
                String str = obj.next();
                a.o(str, "it");
                p0.put(str, p1.opt(str));
             }
          }
       }
       return p0;
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a()+" finish";
    }
    public final HashMap f(f p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tkBridgeContext");
       obj = new HashMap();
       PhotoAdvertisement$TkTemplateData tkTemplateDa = p0.k();
       Integer integer = null;
       Integer integer1 = (tkTemplateDa != null)? Integer.valueOf(tkTemplateDa.mStyleType): integer;
       obj.put("matrix_style_type", integer1);
       PhotoAdvertisement$TkTemplateData tkTemplateDa1 = p0.k();
       if (tkTemplateDa1 != null) {
          integer = Integer.valueOf(tkTemplateDa1.mResourceType);
       }
       obj.put("matrix_resource_type", integer);
       return obj;
    }
    public void g(){
    }
    public void h(){
    }
}
