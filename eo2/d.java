package eo2.d;
import a71.a;
import eo2.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import eo2.h$c$a;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class d implements a	// class@00279b
{
    public final h a;

    public void d(h p0){
       this.a = p0;
       super();
    }
    public final boolean a(int p0){
       d obj;
       d uod = d.class;
       String str = "1";
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, str);
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       h$c$a a = h$c$a.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(a, obj, h.class, str)) {
          a.p(a, "intent");
          if (a.g(a, a)) {
             obj.w0(false);
          }
       }
       return false;
    }
}
