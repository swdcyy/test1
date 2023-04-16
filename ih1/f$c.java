package ih1.f$c;
import erd.g;
import ih1.f;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ih1.o;
import yg1.e;
import eh1.c;
import z1.k;
import kotlin.jvm.internal.a;
import nsd.u;
import ih1.g;
import yg1.a;

public final class f$c implements g	// class@0028db
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
       }else {
          c obj = this.b.g.get();
          a.o(obj, "liveStreamId.get\(\)");
          Object obj1 = obj;
          obj = this.b.h.get();
          a.o(obj, "giftApiRequestPathSuffix.get\(\)");
          Object obj2 = obj;
          obj = new c(obj1, obj2, 0, true, 4, null);
          this.b.c().b("[LiveGiftBoxRepositories][prefetch]normalPager", new e(v8), new g());
       }
       return;
    }
}
