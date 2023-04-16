package k71.h$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class h$b	// class@002cb4
{
    public String resourcePath;

    public void h$b(){
       super("");
    }
    public void h$b(String p0){
       a.p(p0, "resourcePath");
       super();
       this.resourcePath = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof h$b && a.g(this.resourcePath, p0.resourcePath))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       h$b obj = PatchProxy.apply(null, this, h$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.resourcePath;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(resourcePath="+this.resourcePath+"\)";
    }
}
