package m02.k1;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.List;
import m02.l1;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class k1	// class@0030c7
{
    public final Map a;
    public final String b;

    public void k1(String p0){
       super();
       this.b = p0;
       this.a = new LinkedHashMap();
    }
    public final void a(LivePlayStage p0,long p1){
       k1 ok1 = k1.class;
       if (PatchProxy.isSupport(ok1) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ok1, "1")) {
          return;
       }
       a.p(p0, "stage");
       if (this.a.containsKey(p0)) {
          b.S(l1.a(), "set stage end time repeat, stage: "+p0, "liveStreamId", this.b);
          return;
       }else {
          b.S(l1.a(), "set stage end time: "+p0+", "+p1, "liveStreamId", this.b);
          this.a.put(p0, Long.valueOf(p1));
          return;
       }
    }
}
