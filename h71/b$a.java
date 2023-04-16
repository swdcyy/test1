package h71.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$a	// class@00262c
{
    public final Boolean detest;
    public final Integer endMode;
    public final List endPkReasonTypes;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b$a && (a.g(this.detest, p0.detest) && (a.g(this.endPkReasonTypes, p0.endPkReasonTypes) && a.g(this.endMode, p0.endMode))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.detest;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b$a tendPkReason = this.endPkReasonTypes;
       int i2 = (tendPkReason != null)? tendPkReason.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tendPkReason = this.endMode;
       if (tendPkReason != null) {
          i = tendPkReason.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEndPkInAdvanceParam\(detest="+this.detest+", endPkReasonTypes="+this.endPkReasonTypes+", endMode="+this.endMode+"\)";
    }
}
