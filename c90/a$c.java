package c90.a$c;
import erd.o;
import java.lang.String;
import c90.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pr3.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Map;

public final class a$c implements o	// class@000ce7
{
    public final String b;
    public final a c;
    public final HashMap d;

    public void a$c(String p0,a p1,HashMap p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       d uod = PatchProxy.applyOneRefsWithListener(p0, this, a$c.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          PostUtils.D("CommonSceneDataLoader", "download media scene audio asset failed", p0);
          a$c tb = this.b;
          a.o(tb, "audioUrl");
          this.c.d.put(tb, this.c.a);
          uod = new d();
          PatchProxy.onMethodExit(a$c.class, "1");
       }
       return uod;
    }
}
