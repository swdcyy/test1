package le9.g;
import le9.g$a;
import nsd.u;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@002dc6
{
    public final Map a;
    public final Map b;
    public static final g c;
    public static final g$a d;

    static {
       g.d = new g$a(null);
       g.c = new g(new HashMap(), new HashMap());
    }
    public void g(Map p0,Map p1){
       a.p(p0, "runtimeMap");
       a.p(p1, "originRuntimeMap");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       g tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicRuntimeData\(runtimeMap="+this.a+", originRuntimeMap="+this.b+"\)";
    }
}
