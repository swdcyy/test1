package k71.e$a;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e$a	// class@002caa
{
    public final Boolean enableDismissTouchOutside;

    public void e$a(Boolean p0){
       super();
       this.enableDismissTouchOutside = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e$a && a.g(this.enableDismissTouchOutside, p0.enableDismissTouchOutside))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e$a obj = PatchProxy.apply(null, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableDismissTouchOutside;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(enableDismissTouchOutside="+this.enableDismissTouchOutside+"\)";
    }
}
