package h71.n$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class n$a	// class@00263f
{
    public final String jobId;

    public void n$a(String p0){
       super();
       this.jobId = p0;
    }
    public final String a(){
       return this.jobId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof n$a && a.g(this.jobId, p0.jobId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       n$a obj = PatchProxy.apply(null, this, n$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.jobId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, n$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(jobId="+this.jobId+"\)";
    }
}
