package k71.k$a;
import com.kuaishou.live.core.show.webview.cache.LiveWebViewLocalCacheEntry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class k$a	// class@002cb8
{
    public final LiveWebViewLocalCacheEntry param;

    public void k$a(){
       super(null);
    }
    public void k$a(LiveWebViewLocalCacheEntry p0){
       super();
       this.param = p0;
    }
    public final LiveWebViewLocalCacheEntry a(){
       return this.param;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k$a && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k$a obj = PatchProxy.apply(null, this, k$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
