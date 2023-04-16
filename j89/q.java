package j89.q;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class q	// class@0027ba
{
    public List a;
    public long b;
    public long c;

    public void q(List p0,long p1,long p2){
       a.p(p0, "sampleDataList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final List a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof q && (a.g(this.a, p0.a) && (!this.b - p0.b && !this.c - p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       q obj = PatchProxy.apply(null, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       q tb = this.b;
       tb = this.c;
       return ((((i * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ThreadStackSampleSlice\(sampleDataList="+this.a+", timestampBegin="+this.b+", timestampEnd="+this.c+"\)";
    }
}
