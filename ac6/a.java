package ac6.a;
import com.kwai.framework.perf.degrade.DegradeResultReason;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@00006d
{
    public final boolean needDegrade;
    public final DegradeResultReason reason;

    public void a(boolean p0,DegradeResultReason p1){
       a.p(p1, "reason");
       super();
       this.needDegrade = p0;
       this.reason = p1;
    }
    public void a(boolean p0,DegradeResultReason p1,int p2,u p3){
       p1 = (p2 & 0x02)? DegradeResultReason.NONE_DEGRADE: null;
       super(p0, p1);
       return;
    }
    public final boolean a(){
       return this.needDegrade;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.needDegrade == p0.needDegrade && a.g(this.reason, p0.reason)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.needDegrade;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       a treason = this.reason;
       int i1 = (treason != null)? treason.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DegradeResult\(needDegrade="+this.needDegrade+", reason="+this.reason+"\)";
    }
}
