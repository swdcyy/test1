package l71.i$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class i$a	// class@002e9a
{
    public final String userId;

    public void i$a(String p0){
       super();
       this.userId = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i$a && a.g(this.userId, p0.userId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       i$a obj = PatchProxy.apply(null, this, i$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(userId="+this.userId+"\)";
    }
}
