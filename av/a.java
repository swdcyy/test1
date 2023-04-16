package av.a;
import java.lang.Object;
import java.util.HashMap;
import xu.p;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bowl.data.center.data.model.PageData;

public class a	// class@000214
{
    public String a;
    public PageData b;
    public Map c;
    public p d;
    public boolean e;

    public void a(){
       super();
       this.c = new HashMap();
    }
    public static a a(p p0,Map p1,boolean p2){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.c = p1;
       obj.d = p0;
       String str = (p0 == null)? "": p0.getPageName();
       obj.a = str;
       PageData pageData = (p0 == null)? null: p0.c();
       obj.b = pageData;
       obj.e = p2;
       return obj;
    }
}
