package kj0.b;
import kj0.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.CookieManager;

public final class b implements a	// class@002d43
{

    public void b(){
       super();
    }
    public String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CookieManager.getInstance().getCookie(p0);
    }
}
