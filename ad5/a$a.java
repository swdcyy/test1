package ad5.a$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a$a	// class@000071
{
    public int a;
    public String b;

    public void a$a(){
       super();
    }
    public static a$a a(String p0){
       a$a obj = PatchProxy.applyOneRefs(p0, null, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.a = 511;
       obj.b = p0;
       return obj;
    }
    public static a$a b(){
       a$a obj = PatchProxy.apply(null, null, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.a = 1;
       obj.b = "";
       return obj;
    }
}
