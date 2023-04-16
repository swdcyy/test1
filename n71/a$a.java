package n71.a$a;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@0032b7
{
    public final Integer bizType;
    public final String pkId;
    public final Integer source;

    public final Integer a(){
       return this.bizType;
    }
    public final Integer b(){
       return this.source;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.pkId, p0.pkId) && (a.g(this.source, p0.source) && a.g(this.bizType, p0.bizType))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pkId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$a tsource = this.source;
       int i2 = (tsource != null)? tsource.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsource = this.bizType;
       if (tsource != null) {
          i = tsource.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(pkId="+this.pkId+", source="+this.source+", bizType="+this.bizType+"\)";
    }
}
