package lz1.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e$a	// class@00308e
{
    public final long a;
    public final long b;

    public void e$a(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final long a(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof e$a && (!this.a - p0.a && !this.b - p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e$a obj = PatchProxy.apply(null, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       e$a tb = this.b;
       return (((int)(obj ^ (obj >> 32)) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChecksumData\(checkSum="+this.a+", timestamp="+this.b+"\)";
    }
}
