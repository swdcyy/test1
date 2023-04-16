package b89.a$c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$c	// class@00038e
{
    public final String a;
    public final String b;
    public final String c;

    public void a$c(String p0,String p1,String p2){
       a.p(p0, "photoId");
       a.p(p1, "userName");
       a.p(p2, "type");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.c;
    }
    public final String b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$c obj = PatchProxy.apply(null, this, a$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OriginalPhoto\(photoId="+this.a+", userName="+this.b+", type="+this.c+"\)";
    }
}
