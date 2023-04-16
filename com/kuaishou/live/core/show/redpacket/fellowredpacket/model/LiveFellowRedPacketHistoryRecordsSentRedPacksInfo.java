package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketHistoryRecordsSentRedPacksInfo;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveFellowRedPacketHistoryRecordsSentRedPacksInfo implements Serializable, CursorResponse	// class@000e95
{
    public String mGiftsCreatedTime;
    public int mGrabbedRedPacksCount;
    public int mIsRefund;
    public List mRemainGiftsList;
    public String mRemainRedPacksDescription;
    public int mTotalGiftCount;
    public long mTotalKsCoin;
    public int mTotalRedPacksCount;
    public static final long serialVersionUID = 0x2099cbc943b0d71d;

    public void LiveFellowRedPacketHistoryRecordsSentRedPacksInfo(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mRemainGiftsList;
    }
    public boolean hasMore(){
       return false;
    }
}
