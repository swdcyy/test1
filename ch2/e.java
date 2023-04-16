package ch2.e;
import ok.o;
import com.kuaishou.live.core.show.redpacket.krn.j;
import java.util.Map;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.krn.f;
import java.util.Objects;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ng2.s;

public final class e implements o	// class@000536
{
    public final j b;
    public final Map c;

    public void e(j p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       boolean b = (p0 != null && tc.containsKey(p0.c()))? true: false;
       if (!b) {
          if (p0 != null) {
             b.P(j.A, "removeRedPacketPendant, redPacketId = "+p0.c());
          }
          if (!PatchProxy.applyVoidOneRefs(p0, tb, j.class, "9") && p0 != null) {
             j x = tb.x;
             if (x != null) {
                x.o2(p0.b());
             }
             p0.a();
          }
       }
    label_0052 :
       return b;
    }
}
