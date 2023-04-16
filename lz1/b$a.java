package lz1.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$a	// class@003089
{
    public final long a;
    public long b;
    public long c;

    public void b$a(long p0,long p1,long p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof b$a && (!this.a - p0.a && (!this.b - p0.b && !this.c - p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       b$a tb = this.b;
       tb = this.c;
       return (((((int)(obj ^ (obj >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReportStatus\(checksum="+this.a+", successTimestamp="+this.b+", failTimestamp="+this.c+"\)";
    }
}
