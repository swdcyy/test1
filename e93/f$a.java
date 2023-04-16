package e93.f$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f$a	// class@0026bc
{
    public final String a;
    public long b;

    public void f$a(String p0,long p1){
       a.p(p0, "name");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final long a(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f$a && (a.g(this.a, p0.a) && !this.b - p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f$a obj = PatchProxy.apply(null, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       f$a tb = this.b;
       return ((i * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskCostTime\(name="+this.a+", timeMs="+this.b+"\)";
    }
}
