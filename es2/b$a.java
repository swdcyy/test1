package es2.b$a;
import a71.a;
import ds2.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ds2.d$a$a;
import ds2.d$a;

public final class b$a implements a	// class@0027cb
{
    public final d a;

    public void b$a(d p0){
       this.a = p0;
       super();
    }
    public final boolean a(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.a.v0(d$a$a.a);
       return false;
    }
}
