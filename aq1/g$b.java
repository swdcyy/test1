package aq1.g$b;
import android.view.View$OnClickListener;
import aq1.g;
import zp1.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multichat.chatedit.LiveMultiChatLogType;
import java.util.Map;
import yp1.b;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatUserLabel;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.a;
import rp1.b;
import yh3.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import zp1.a;
import zp1.q$a;
import zp1.q;

public final class g$b implements View$OnClickListener	// class@000285
{
    public final g b;
    public final m c;

    public void g$b(g p0,m p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       LiveMultiChatLogType cLICK = LiveMultiChatLogType.CLICK;
       g$b tb = this.b;
       Map map = tb.J.e(tb.I);
       e0 uoe0 = this.b.J.d();
       ClientContent$LiveStreamPackage liveStreamPa = this.b.J.f();
       g i = this.b.I;
       LiveMultiChatUserLabel value = this.c.v0().getValue();
       if (value != null) {
          value = value.label;
          if (value != null) {
          label_0040 :
             ImmutableMap immutableMap = ImmutableMap.of(i, value);
             a.o(immutableMap, "ImmutableMap.of\(\n       бн.EMPTY_STRING\n          \)");
             b.a(cLICK, map, uoe0, liveStreamPa, immutableMap);
             this.b.b3().x0(q$a.a);
             return;
          }
       }
       String str = "";
       goto label_0040 ;
    }
}
