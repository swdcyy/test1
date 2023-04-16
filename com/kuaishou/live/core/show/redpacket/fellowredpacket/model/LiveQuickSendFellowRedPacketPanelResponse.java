package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFellowRedPacketPanelResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveQuickSendFellowRedPacketPanelResponse implements Serializable, b	// class@000e9e
{
    public LiveQuickSendFellowRedPacketPanelResponse$IntelligentDeliveryInfo mIntelligentDeliveryInfo;
    public List mLiveQuickSendFollowRedPacketPanelItemInfoList;
    public static final long serialVersionUID = 0x161d785024209964;

    public void LiveQuickSendFellowRedPacketPanelResponse(){
       super();
    }
    public List getItems(){
       return this.mLiveQuickSendFollowRedPacketPanelItemInfoList;
    }
    public boolean hasMore(){
       return false;
    }
}
