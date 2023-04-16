package j71.b$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$a	// class@002a53
{
    public final String extraInfo;

    public void b$a(){
       super(null);
    }
    public void b$a(String p0){
       super();
       this.extraInfo = p0;
    }
    public final String a(){
       return this.extraInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b$a && a.g(this.extraInfo, p0.extraInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.extraInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(extraInfo="+this.extraInfo+"\)";
    }
}
