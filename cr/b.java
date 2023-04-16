package cr.b;
import cr.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class b extends g	// class@00141e
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public void b(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public int b(){
       return this.d;
    }
    public int c(){
       return this.b;
    }
    public int d(){
       return this.c;
    }
    public int e(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof g) {
          return false;
       }
       if (this.a != p0.e() || (this.b != p0.c() || (this.c != p0.d() || this.d != p0.b()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((((((this.a ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c) * 0xf4243) ^ this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DatabaseStat{stashedLogCount="+this.a+", maxStashedLogId="+this.b+", minStashedLogId="+this.c+", longestStashedDurationInHour="+this.d+"}";
    }
}
