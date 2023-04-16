package fd6.b;
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
import java.util.List;
import trd.t;
import java.util.concurrent.Future;
import java.lang.StringBuilder;
import qj7.d;

public final class b implements b	// class@0015fb
{
    public final b b;

    public void b(b p0){
       a.p(p0, "mUrlSource");
       super();
       this.b = p0;
    }
    public String a(a p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pluginUrlInfo");
       String str = null;
       if (!this.b.b()) {
          return str;
       }
       obj = this.b.e(p0.a());
       if (this.b.a()) {
          if (obj == null || !obj.b()) {
             this.b.d(t.k(p0.a())).get();
             obj = this.b.e(p0.a());
          }
          if (obj == null || !obj.b()) {
             d.c("UrlInterceptor isFreeTraffic=true, but cdn url is null or not free traffic");
          }else {
             d.c("UrlInterceptor isFreeTraffic=true, url="+obj.a());
             return obj.a();
          }
       }
       return str;
    }
}
