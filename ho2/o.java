package ho2.o;
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

public final class o extends Url	// class@002df1
{
    public final String a;

    public void o(String p0){
       a.p(p0, "param");
       super();
       this.a = p0;
    }
    public final String a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof o && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       o obj = PatchProxy.apply(null, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UrlParam\(param="+this.a+"\)";
    }
}
