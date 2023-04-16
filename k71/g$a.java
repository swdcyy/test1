package k71.g$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g$a	// class@002caf
{
    public final String biz;
    public final String source;
    public final String taskId;

    public final String a(){
       return this.biz;
    }
    public final String b(){
       return this.source;
    }
    public final String c(){
       return this.taskId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g$a && (a.g(this.biz, p0.biz) && (a.g(this.taskId, p0.taskId) && a.g(this.source, p0.source))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g$a obj = PatchProxy.apply(null, this, g$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.biz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       g$a ttaskId = this.taskId;
       int i2 = (ttaskId != null)? ttaskId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttaskId = this.source;
       if (ttaskId != null) {
          i = ttaskId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(biz="+this.biz+", taskId="+this.taskId+", source="+this.source+"\)";
    }
}
