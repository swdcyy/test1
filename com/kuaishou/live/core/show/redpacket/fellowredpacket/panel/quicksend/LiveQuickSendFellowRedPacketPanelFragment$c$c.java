package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c$c;
import sfc.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFollowRedPacketPanelItemInfo;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import com.yxcorp.retrofit.model.KwaiException;

public class LiveQuickSendFellowRedPacketPanelFragment$c$c extends a	// class@000eb6
{
    public final LiveQuickSendFellowRedPacketPanelFragment$c c;

    public void LiveQuickSendFellowRedPacketPanelFragment$c$c(LiveQuickSendFellowRedPacketPanelFragment$c p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuickSendFellowRedPacketPanelFragment$c$c.class, "1")) {
          return;
       }
       super.b(p0);
       LiveFellowRedPacketLogger.j(this.c.x.G.a(), this.c.p.mLiveGiftPackage.mTotalKsCoin, 8, p0);
       if (p0 instanceof KwaiException) {
          LiveFellowRedPacketLogger.h(this.c.x.G.a(), p0.getErrorCode(), p0.getMessage());
       }
       return;
    }
}
