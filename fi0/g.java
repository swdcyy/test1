package fi0.g;
import yd.a;
import com.kuaishou.krn.c;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.google.gson.JsonElement;

public class g implements a	// class@002347
{
    public final c a;

    public void g(c p0){
       this.a = p0;
       super();
    }
    public Object a(String p0,String p1,Type p2,Object p3){
       d obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          p3 = obj.a(p0, p1, p2, p3);
       }
       return p3;
    }
    public JsonElement b(String p0,String p1,JsonElement p2){
       d obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          p2 = obj.b(p0, p1, p2);
       }
       return p2;
    }
}
