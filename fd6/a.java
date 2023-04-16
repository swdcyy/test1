package fd6.a;
import gd6.b;
import hd6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gd6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hd6.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import qj7.d;

public final class a implements b	// class@0015fa
{
    public final b b;

    public void a(b p0){
       a.p(p0, "mUrlSource");
       super();
       this.b = p0;
    }
    public String a(a p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pluginUrlInfo");
       String str = null;
       if (!this.b.b()) {
          return str;
       }
       p0 = this.b.e(p0.a());
       if (p0 != null) {
          obj = p0.a();
          if (obj != null) {
             obj = (obj.length() > 0)? 1: null;
             if (obj == 1) {
                d.c("UrlInterceptor cdn url: "+p0.a());
                return p0.a();
             }
          }
       }
       return str;
    }
}
