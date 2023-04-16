package eu1.b;
import java.lang.Object;
import eu1.c;
import hu1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut1.f;
import pu1.m;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.graphics.Rect;
import sp5.b;
import java.lang.Math;
import eu1.d;
import java.lang.Float;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import java.util.List;

public abstract class b	// class@0021f8
{

    public void b(){
       super();
    }
    public final a a(c p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveMultiPkUIInfo");
       a uoa = null;
       if (m.l(p0.b())) {
          return uoa;
       }
       if (p0.b != null) {
          obj = p0.e().entrySet().iterator();
          while (obj.hasNext()) {
             Map$Entry uEntry = obj.next();
             if (a.g(uEntry.getKey(), p0.a())) {
                Rect value = uEntry.getValue();
                float f = (float)value.width() / (float)p0.c().a;
                f = f - 0x3f000000;
                if (Math.abs(f) - 0x3c23d70a < 0 && value.height() == p0.c().b) {
                   d uod = new d(value.width(), value.height(), uoa);
                   uod.leftMargin = value.left;
                   uod.topMargin = value.top;
                   return new a(uod, LiveMultiPkLayoutViewType.MULTI_PK_BEST_AREA, "VIEW_KEY_BEST_AREA");
                }
             }
          }
       }
       return uoa;
    }
    public abstract List b(c p0);
    public abstract List c(c p0);
    public abstract List d(c p0);
}
