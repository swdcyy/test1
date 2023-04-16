package h71.z$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class z$a	// class@002652
{
    public final String biz;
    public final String source;
    public final String token;

    public final String a(){
       return this.biz;
    }
    public final String b(){
       return this.token;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof z$a && (a.g(this.biz, p0.biz) && (a.g(this.token, p0.token) && a.g(this.source, p0.source))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       z$a obj = PatchProxy.apply(null, this, z$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.biz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       z$a ttoken = this.token;
       int i2 = (ttoken != null)? ttoken.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttoken = this.source;
       if (ttoken != null) {
          i = ttoken.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, z$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(biz="+this.biz+", token="+this.token+", source="+this.source+"\)";
    }
}
