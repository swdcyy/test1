package fu2.g$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import at5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fu2.g;
import java.lang.Integer;
import java.lang.Number;

public final class g$a	// class@0029e9
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final a a(Object p0,LiveStreamFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "feed");
       return new g(p1, p0);
    }
    public final int b(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return ((p0 - g.f) - g.g);
    }
}
