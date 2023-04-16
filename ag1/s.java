package ag1.s;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class s	// class@000093
{
    public Map data;
    public int reqType;
    public int seqId;

    public void s(int p0,int p1,Map p2){
       a.p(p2, "data");
       super();
       this.reqType = p0;
       this.seqId = p1;
       this.data = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof s && (this.reqType == p0.reqType && (this.seqId == p0.seqId && a.g(this.data, p0.data))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.reqType * 31) + this.seqId) * 31;
       s tdata = this.data;
       int i1 = (tdata != null)? tdata.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SendMessage\(reqType="+this.reqType+", seqId="+this.seqId+", data="+this.data+"\)";
    }
}
