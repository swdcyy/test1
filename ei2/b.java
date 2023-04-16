package ei2.b;
import androidx.lifecycle.LifecycleOwner;
import wu1.g;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import wu1.a;
import com.kuaishou.android.live.log.b;

public final class b	// class@002729
{
    public final String a;
    public a b;
    public final LifecycleOwner c;
    public final g d;
    public final String e;

    public void b(LifecycleOwner p0,g p1,String p2){
       a.p(p0, "lifecycleOwner");
       a.p(p2, "liveStreamId");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = "[LiveRichCardPendantVC]"+"[liveStreamId = "+p2+']';
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          c uoc = LiveRichCardStateManager.h.f();
          uoc.appendTag(this.a);
          b.T(uoc, "removeTopActivityTkPendant", "bizId", tb.i, "activityId", tb.j);
          b td = this.d;
          if (td != null) {
             td.a(tb.i+tb.j);
          }
       }
       return;
    }
}
