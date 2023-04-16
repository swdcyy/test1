package h71.d$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d$a	// class@002630
{
    public final String roomInfo;

    public void d$a(String p0){
       super();
       this.roomInfo = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d$a && a.g(this.roomInfo, p0.roomInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d$a obj = PatchProxy.apply(null, this, d$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.roomInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(roomInfo="+this.roomInfo+"\)";
    }
}
