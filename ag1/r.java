package ag1.r;
import com.google.gson.JsonElement;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class r	// class@000092
{
    public JsonElement data;
    public String error;
    public int reqType;
    public int result;
    public int seqId;

    public void r(int p0,int p1,int p2,JsonElement p3,String p4){
       a.p(p3, "data");
       super();
       this.reqType = p0;
       this.seqId = p1;
       this.result = p2;
       this.data = p3;
       this.error = p4;
    }
    public final int a(){
       return this.reqType;
    }
    public final int b(){
       return this.result;
    }
    public final int c(){
       return this.seqId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof r && (this.reqType == p0.reqType && (this.seqId == p0.seqId && (this.result == p0.result && (a.g(this.data, p0.data) && a.g(this.error, p0.error))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((this.reqType * 31) + this.seqId) * 31) + this.result) * 31;
       r tdata = this.data;
       int i1 = 0;
       int i2 = (tdata != null)? tdata.hashCode(): 0;
       i = (i + i2) * 31;
       tdata = this.error;
       if (tdata != null) {
          i1 = tdata.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ResponseMessage\(reqType="+this.reqType+", seqId="+this.seqId+", result="+this.result+", data="+this.data+", error="+this.error+"\)";
    }
}
