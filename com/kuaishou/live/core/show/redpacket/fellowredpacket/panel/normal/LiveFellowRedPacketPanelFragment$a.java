package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.SourceType;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.d;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$g;

public class LiveFellowRedPacketPanelFragment$a extends m	// class@000ea0
{
    public final LiveFellowRedPacketPanelFragment c;

    public void LiveFellowRedPacketPanelFragment$a(LiveFellowRedPacketPanelFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketPanelFragment$a.class, "1")) {
          return;
       }
       LiveFellowRedPacketPanelFragment$a tc = this.c;
       Objects.requireNonNull(tc);
       LiveFellowRedPacketPanelFragment$a uoa = null;
       if (!PatchProxy.applyVoid(null, tc, LiveFellowRedPacketPanelFragment.class, "6")) {
          d.f(LiveRedPacketAction.RED_PACK_SEND_BUTTON_CLICK, SourceType.AUDIENCE_BUTTON_SOURCE_TYPE, RedPacketType.RED_PACKET_TYPE_ACTIVITY, uoa);
       }
       LiveFellowRedPacketPanelFragment$a tc1 = this.c;
       LiveFellowRedPacketPanelFragment s = tc1.S;
       LiveFellowRedPacketPanelFragment k = tc1.K;
       Object obj = tc1.g7().N0(this.c.K);
       tc = this.c;
       LiveFellowRedPacketPanelFragment m = tc.M;
       LiveFellowRedPacketPanelFragment l = tc.L;
       LiveGiftPackage liveGiftPack = (tc.g7().N0(this.c.K) != null)? this.c.g7().N0(this.c.K).mGiftPackageId: 0;
       s.a(tc1, k, obj, m, l, liveGiftPack);
       return;
    }
}
