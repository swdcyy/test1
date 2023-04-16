package j31.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;

public class a	// class@002a44
{

    public void a(){
       super();
    }
    public static String a(String p0){
       i3 obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("biz_type", p0);
       return obj.e();
    }
}
