package ho2.p;
import com.kuaishou.live.core.voiceparty.background.multiimage.Url;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class p extends Url	// class@002df2
{
    public final String a;

    public void p(String p0){
       a.p(p0, "string");
       super();
       this.a = p0;
    }
    public final String a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof p && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       p obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UrlString\(string="+this.a+"\)";
    }
}
