package eub.i$a;
import im8.g;
import q16.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import k2b.u1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eub.h;
import java.util.Map;
import java.util.HashMap;

public final class i$a implements g	// class@002822
{
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;

    public void i$a(a p0){
       String str1;
       a.p(p0, "editPageParam");
       super();
       a p1 = p0.p1;
       if (p1 != null) {
          String str = (!p1.length())? 1: null;
          if (!str) {
             p0 = p0.p1;
             a.o(p0, "editPageParam.mTaskId");
          label_0029 :
             this.b = str1;
             return;
          }
       }
       str1 = u1.f();
       a.o(str1, "Logger.generateTaskSessionId\(\)");
       goto label_0029 ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i$a.class, new h());
       }else {
          obj.put(i$a.class, null);
       }
       return obj;
    }
}
