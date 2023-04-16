package dt1.g;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankEntryView;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import du1.d;
import k2b.e0;
import zs1.b;
import androidx.lifecycle.LiveData;
import dt1.b;
import ct1.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LivePkPackage;
import k2b.u1;
import android.view.ViewGroup;

public final class g implements Observer	// class@00201d
{
    public final LiveMultiPkCohesionRankVC b;

    public void g(LiveMultiPkCohesionRankVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          LiveMultiPkCohesionRankEntryView liveMultiPkC = LiveMultiPkCohesionRankVC.V2(this.b);
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b.q.a();
             e0 uoe0 = this.b.q.i();
             String str = this.b.o.q();
             Boolean value = this.b.l.a().getValue();
             if (value == null) {
                value = Boolean.FALSE;
             }
             a.o(value, "rankModel.hasSendCohesionGift.value ?: false");
             boolean b = value.booleanValue();
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(p0, uoe0, str, Boolean.valueOf(b), null, c.class, "1")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_CONVERGENCE_PK_HELP_LIST_BUTTON";
                i3 oi3 = i3.f();
                oi3.c("status", Integer.valueOf(b));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = p0;
                p0 = new ClientContent$LivePkPackage();
                p0.pkId = str;
                uContentPack.livePkPackage = p0;
                u1.C0("", uoe0, 6, uElementPack, uContentPack);
             }
             i = 0;
          }else {
             i = 8;
          }
          liveMultiPkC.setVisibility(i);
       }
       return;
    }
}
