package l51.a$a;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@002e81
{
    public final String biz;
    public final Object bizInfo;
    public final long startTime;
    public final Long stopTime;

    public void a$a(String p0,long p1,Long p2,Object p3){
       a.p(p0, "biz");
       super();
       this.biz = p0;
       this.startTime = p1;
       this.stopTime = p2;
       this.bizInfo = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.biz, p0.biz) && (!this.startTime - p0.startTime && (a.g(this.stopTime, p0.stopTime) && a.g(this.bizInfo, p0.bizInfo)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.biz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       a$a tstartTime = this.startTime;
       i1 = ((i1 * 31) + (int)(tstartTime ^ (tstartTime >> 32))) * 31;
       tstartTime = this.stopTime;
       int i2 = (tstartTime != null)? tstartTime.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstartTime = this.bizInfo;
       if (tstartTime != null) {
          i = tstartTime.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BizData\(biz="+this.biz+", startTime="+this.startTime+", stopTime="+this.stopTime+", bizInfo="+this.bizInfo+"\)";
    }
}
