package m41.a$a;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@00311b
{
    public final String message;
    public final Integer messageType;

    public void a$a(Integer p0,String p1){
       super();
       this.messageType = p0;
       this.message = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.messageType, p0.messageType) && a.g(this.message, p0.message)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.messageType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$a tmessage = this.message;
       if (tmessage != null) {
          i = tmessage.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Message\(messageType="+this.messageType+", message="+this.message+"\)";
    }
}
