package bq1.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import yp1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import zp1.c;
import zp1.l;
import yp1.a;
import yh3.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import zp1.b;
import zp1.q$i;
import zp1.q;

public final class d implements View$OnClickListener	// class@0003e1
{
    public final LiveMultiChatAudienceBaseCellController b;

    public void d(LiveMultiChatAudienceBaseCellController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       LiveMultiChatAudienceBaseCellController k = tb.K;
       e0 uoe0 = tb.L.d();
       ClientContent$LiveStreamPackage liveStreamPa = this.b.L.f();
       LiveMultiChatAudienceBaseCellController h = this.b.H;
       if (h == null) {
          a.S("audienceMultiChatFollowLottie");
       }
       tb = (!h.getVisibility())? 1: null;
       boolean b = this.b.z3();
       String str = this.b.h3();
       d tb1 = this.b;
       boolean b1 = (!tb1.L.i(tb1.K) && this.b.N.c())? true: false;
       a.c(k, uoe0, liveStreamPa, tb, b, str, "2", b1);
       tb = this.b;
       if (tb.L.k(tb.K)) {
          this.b.M3();
       }else {
          this.b.b3().x0(q$i.a);
       }
       return;
    }
}
