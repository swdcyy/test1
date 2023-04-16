package com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public class LiveFellowRedPacketResponse implements Serializable	// class@000e9a
{
    public String mDisplayTotalCoin;
    public List mGiftList;
    public boolean mIsGrabbed;
    public String mRedPacketId;
    public String mSubPackId;
    public static final long serialVersionUID = 0x435812ba19ef90fd;

    public void LiveFellowRedPacketResponse(){
       super();
    }
    public static LiveFellowRedPacketResponse createEmptyFellowRedPackResponse(String p0){
       LiveFellowRedPacketResponse obj = PatchProxy.applyOneRefs(p0, null, LiveFellowRedPacketResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveFellowRedPacketResponse();
       obj.mIsGrabbed = false;
       obj.mSubPackId = "";
       obj.mRedPacketId = p0;
       obj.mDisplayTotalCoin = "";
       obj.mGiftList = new ArrayList();
       return obj;
    }
}
