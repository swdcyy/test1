package co2.e2;
import vq5.d;
import android.content.Context;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import trd.t;
import java.util.LinkedHashMap;
import com.kuaishou.live.core.voiceparty.d0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import co2.d2;
import vq5.b;

public final class e2	// class@000583
{
    public final List a;
    public final Map b;
    public final d c;
    public final Context d;

    public void e2(d p0,Context p1,LiveStreamModel p2){
       a.p(p0, "liveRouterManager");
       a.p(p1, "context");
       super();
       this.c = p0;
       this.d = p1;
       List list = t.k("voicePartyApply");
       this.a = list;
       this.b = new LinkedHashMap();
       if (d0.q(p2) && !PatchProxy.applyVoid(null, this, e2.class, "1")) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this.c.t5(str, new d2(str, this));
          }
       }
       return;
    }
}
