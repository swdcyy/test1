package l51.a$b;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$b	// class@002e82
{
    public final long a;
    public Long b;
    public int c;

    public void a$b(long p0,Long p1,int p2){
       super();
       this.a = p0;
       this.b = null;
       this.c = p2;
    }
    public final int a(){
       return this.c;
    }
    public final long b(){
       return this.a;
    }
    public final void c(int p0){
       this.c = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$b && (!this.a - p0.a && (a.g(this.b, p0.b) && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$b obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.b;
       int i1 = (obj != null)? obj.hashCode(): 0;
       return (((i + i1) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BizStatus\(startTime="+this.a+", stopTime="+this.b+", startCount="+this.c+"\)";
    }
}
