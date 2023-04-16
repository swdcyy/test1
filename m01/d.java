package m01.d;
import com.yxcorp.gifshow.widget.m;
import m01.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import java.util.Objects;
import mk1.h;
import xp5.i;
import lp3.c;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ik1.a0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tk1.b;

public class d extends m	// class@00309d
{
    public final b c;

    public void d(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d tc = this.c;
       GiftTab packetGift = GiftTab.PacketGift;
       tc.S8(tc.s, packetGift, "CLIENT_GIFT_BOX_TAB_CLICK", "[LiveAudienceGiftBoxTabChangePresenter][initGiftTabInfos]click packet gift tab", 1);
       tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, b.class, "8")) {
          ClientContent$LiveStreamPackage liveStreamPa = tc.q.n.a(i.class).a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a0.class, "17")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 0x78fb;
             u1.u0(9, uElementPack, a0.c(liveStreamPa));
          }
          tc.P8(packetGift, tc.q.B);
       }
       return;
    }
}
