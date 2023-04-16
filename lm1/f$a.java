package lm1.f$a;
import java.lang.Object;
import nsd.u;
import ht5.b;
import lm1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.models.Gift;
import lm1.e;

public final class f$a	// class@002fa1
{

    public void f$a(){
       super();
    }
    public void f$a(u p0){
       super();
    }
    public final f a(b p0){
       b a;
       b obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sendParams");
       obj = p0.f;
       String str = (obj != null)? obj.get("recoGiftLlsid"): "";
       String str1 = str;
       b o = p0.o;
       a = p0.a;
       b j = p0.j;
       boolean b = true;
       if (p0.c <= b) {
          b = false;
       }
       f uof = new f(o, a, j, b, false, true, p0.h, p0.e, false, p0.b, str1, null);
       return str;
    }
}
