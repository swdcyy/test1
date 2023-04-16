package f93.f;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@0028f9
{
    public final String a;

    public void f(){
       super(null, 1, null);
    }
    public void f(String p0){
       super();
       this.a = p0;
    }
    public void f(String p0,int p1,u p2){
       super(null);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLiteCommercialBenefitCardLogData\(extraInfo="+this.a+"\)";
    }
}
