package d61.h0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import java.lang.RuntimeException;
import com.yxcorp.utility.TextUtils;

public class h0	// class@001f1e
{

    public void h0(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.a().c() || p0 != null) {
          return TextUtils.k(p0);
       }
       throw new RuntimeException("live, param can not null");
    }
}
