package ag1.q;
import com.kuaishou.live.common.core.component.effect.renderer.ReceivedData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class q	// class@000091
{
    public ReceivedData data;
    public int reqType;
    public int seqId;

    public final ReceivedData a(){
       return this.data;
    }
    public final int b(){
       return this.reqType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof q && (this.reqType == p0.reqType && (this.seqId == p0.seqId && a.g(this.data, p0.data))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.reqType * 31) + this.seqId) * 31;
       q tdata = this.data;
       int i1 = (tdata != null)? tdata.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReceivedMessage\(reqType="+this.reqType+", seqId="+this.seqId+", data="+this.data+"\)";
    }
}
