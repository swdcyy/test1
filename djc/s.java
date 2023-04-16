package djc.s;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class s	// class@00221f
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public void s(String p0,int p1,int p2,int p3){
       a.p(p0, "url");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof s && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       s obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ForwardBanner\(url="+this.a+", bgColor="+this.b+", width="+this.c+", height="+this.d+"\)";
    }
}
