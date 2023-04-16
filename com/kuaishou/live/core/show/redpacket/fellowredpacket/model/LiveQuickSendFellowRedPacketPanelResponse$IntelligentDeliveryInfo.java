package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFellowRedPacketPanelResponse$IntelligentDeliveryInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveQuickSendFellowRedPacketPanelResponse$IntelligentDeliveryInfo implements Serializable	// class@000e9d
{
    public String mDeliveryRedPackSubTitle;
    public String mDeliveryRedPackTitle;
    public int mDeliveryStatus;
    public static final long serialVersionUID = 0x6310ebf49189e5dc;

    public void LiveQuickSendFellowRedPacketPanelResponse$IntelligentDeliveryInfo(){
       super();
    }
    public boolean isIntelligentDelivering(){
       boolean b = (this.mDeliveryStatus == 2)? true: false;
       return b;
    }
}
