package djc.s0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class s0	// class@00221e
{
    public final String a;
    public final String b;
    public final String c;

    public void s0(String p0,String p1,String p2){
       a.p(p0, "icon");
       a.p(p1, "text");
       a.p(p2, "jumpUrl");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof s0 && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       s0 obj = PatchProxy.apply(null, this, s0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       s0 tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ForwardTrafficBannerData\(icon="+this.a+", text="+this.b+", jumpUrl="+this.c+"\)";
    }
}
