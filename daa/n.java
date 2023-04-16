package daa.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class n	// class@001eda
{
    public final String type;
    public final String url;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof n && (a.g(this.type, p0.type) && a.g(this.url, p0.url)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       n obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       n turl = this.url;
       if (turl != null) {
          i = turl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TypedImage\(type="+this.type+", url="+this.url+"\)";
    }
}
