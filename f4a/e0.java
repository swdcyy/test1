package f4a.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u3a.c;
import com.yxcorp.gifshow.detail.plc.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.h;

public class e0	// class@0022a1
{
    public static h a;

    static {
       if (PatchProxy.applyVoid(null, null, e0.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, c.class, "1")){
          e0.a = a.b;
       }
    }
    public void e0(){
       super();
    }
    public static boolean a(String p0){
       h obj = PatchProxy.applyOneRefs(p0, null, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = e0.a;
       if (obj != null) {
          return obj.apply(p0).booleanValue();
       }
       return false;
    }
}
