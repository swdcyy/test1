package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketListResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveFellowRedPacketListResponse implements CursorResponse, Serializable	// class@000e97
{
    public int mAuthorityType;
    public String mCurrentRedPackId;
    public String mGrabTimeDescription;
    public String mGuideDescription;
    public List mGuideDescriptionTextList;
    public boolean mIsAssistant;
    public List mLiveGiftPackages;
    public String mRuleDescription;
    public String mRuleUrl;
    public static final long serialVersionUID = 0xdc31fee7e265a80d;

    public void LiveFellowRedPacketListResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mLiveGiftPackages;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean isNoAuthoritySendRedPacket(){
       boolean b = (this.mAuthorityType == 2 && this.mIsAssistant == null)? true: false;
       return b;
    }
}
