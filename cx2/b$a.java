package cx2.b$a;
import a71.a;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b$a implements a	// class@0023f4
{
    public final a a;

    public void b$a(a p0){
       this.a = p0;
       super();
    }
    public final boolean a(int p0){
       if (PatchProxy.isSupport2(b$a.class, "1")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, b$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.a.invoke();
       PatchProxy.onMethodExit(b$a.class, "1");
       return false;
    }
}
