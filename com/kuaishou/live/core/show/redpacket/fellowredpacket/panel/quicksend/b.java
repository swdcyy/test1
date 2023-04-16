package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.b;
import ok.h;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFollowRedPacketPanelItemInfo;

public class b implements h	// class@000eba
{
    public final LiveQuickSendFellowRedPacketPanelFragment$c b;

    public void b(LiveQuickSendFellowRedPacketPanelFragment$c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = (p0 == null)? "": p0.mLiveStreamId;
       return p0;
    }
}
