package k71.r$a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class r$a	// class@002cc4
{
    public final LiveWebViewParam param;

    public void r$a(){
       super(null);
    }
    public void r$a(LiveWebViewParam p0){
       super();
       this.param = p0;
    }
    public final LiveWebViewParam a(){
       return this.param;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof r$a && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       r$a obj = PatchProxy.apply(null, this, r$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, r$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
