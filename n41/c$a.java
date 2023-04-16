package n41.c$a;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$a	// class@0032a9
{
    public final Boolean dismiss;
    public final String url;

    public void c$a(){
       super();
       this.url = "";
       this.dismiss = Boolean.FALSE;
    }
    public final String a(){
       return this.url;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$a && (a.g(this.url, p0.url) && a.g(this.dismiss, p0.dismiss)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c$a obj = PatchProxy.apply(null, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.url;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c$a tdismiss = this.dismiss;
       if (tdismiss != null) {
          i = tdismiss.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(url="+this.url+", dismiss="+this.dismiss+"\)";
    }
}
