package y49.f;
import a59.e;
import java.lang.String;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.l1;

public class f extends e	// class@004103
{
    public final String b;
    public final l c;

    public void f(String p0,l p1){
       a.p(p0, "bridgeName");
       a.p(p1, "bridgeInvoke");
       super();
       this.b = p0;
       this.c = p1;
    }
    public String a(){
       return this.b;
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       String str = this.c.invoke(p0);
       if (str instanceof l1) {
          str = "";
       }
       return str;
    }
}
